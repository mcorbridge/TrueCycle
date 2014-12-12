package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mcorbridge.truecycle.data.men.MensWattData;
import com.mcorbridge.truecycle.data.vo.Cyclist;
import com.mcorbridge.truecycle.data.women.WomensWattData;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private final static String KILOGRAMS = "kilograms";
    private final static String POUNDS = "pounds";

    private Cyclist cyclist;

    private MensWattData mensWattData;
    private WomensWattData womensWattData;

    String aboutText = "This app is based on data collected by Dr. Andy Coggan, a cycling coach at TrainingPeaks (trainingpeaks.com), and an author of 'Training and Racing with a Power Meter'." +
            "This is the most widely accepted and referenced benchmark for power output based on rider category.\n\n " +
            "Note that a cyclist may not measure consistently within the separate categories. This means that although a cyclist can generate listed wattage within one category " +
            "(for example, 5 sec max), they may average higher/lower in others.\n\n" +
            "Using the app is relatively straightforward.  Enter (or select) the appropriate parameters to view a range of watts at a specific effort for the required athletic level." +
            "Navigate between the screens to adjust the values to review wattage ranges for different cyclist weight, category and effort\n\n" +
            "feedback: mikecorbridge@gmail.com";

    NumberPicker np1;
    NumberPicker np2;
    NumberPicker np3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mensWattData = new MensWattData();
        womensWattData = new WomensWattData();
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_layout_test);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.action_home:
                setContentView(R.layout.activity_main);
                return true;
            case R.id.action_about:
                setContentView(R.layout.activity_about);
                setAboutContent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void doViewInputWeight(View v){
        // create new vo for the cyclist
        cyclist = new Cyclist();

        setContentView(R.layout.activity_input_weight);

        EditText mEdit = (EditText)findViewById(R.id.editText);
        mEdit.requestFocus();
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(mEdit, InputMethodManager.SHOW_FORCED);

        setAddTextListener();
        //setNumberPickerValues();
    }

    private void setAddTextListener(){
        EditText mEdit = (EditText)findViewById(R.id.editText);
        mEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Log.d("beforeTextChanged",s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Log.d("onTextChanged",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Log.d("afterTextChanged",s.toString());
                Button button = (Button)findViewById(R.id.button);
                if(s.toString().length() > 0){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }
            }
        });
    }

    private void setNumberPickerValues(){
        np1 = (NumberPicker) findViewById(R.id.numberPicker1);
        np1.setMaxValue(3);
        np1.setMinValue(0);

        np2 = (NumberPicker) findViewById(R.id.numberPicker2);
        np2.setMaxValue(9);
        np2.setMinValue(0);

        np3 = (NumberPicker) findViewById(R.id.numberPicker3);
        np3.setMaxValue(9);
        np3.setMinValue(0);
    }

    public void onSubmitNumberPicker(View v){
        int v1 = np1.getValue();
        int v2 = np2.getValue();
        int v3 = np3.getValue();

        Log.d("number picker: ", String.valueOf(v1) + " " + String.valueOf(v2) + " " + String.valueOf(v3));
    }

    public void doSubmit(View v){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGender);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        View radioButton = radioGroup.findViewById(radioButtonID);
        int ndx = radioGroup.indexOfChild(radioButton);
        cyclist.setGender(ndx);

        EditText mEdit = (EditText)findViewById(R.id.editText);
        Integer intWeight = Integer.parseInt(mEdit.getText().toString());
        Double dblWeight = (double)intWeight;

        cyclist.setWeight(dblWeight);

        RadioButton rb = (RadioButton)findViewById(R.id.radioKilogram);

        if(rb.isChecked()){
            cyclist.setWeightUnit(this.KILOGRAMS);
            cyclist.setWeight(dblWeight);
        }else{
            cyclist.setWeightUnit(this.POUNDS);
            cyclist.setWeight(dblWeight * 0.453592);
        }
        cyclist.setWeightString(mEdit.getText().toString());
        getMensWattData();
    }

    public void getMensWattData(){
        setContentView(R.layout.activity_select_level);
    }

    public void doSubmitCategory(View v){
        RadioGroup g = (RadioGroup) findViewById(R.id.radioGroupCategory);
        int selected = g.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        cyclist.setCategory(b.getText().toString());
        setContentView(R.layout.activity_show_effort);
        TextView mTextView = (TextView) findViewById(R.id.textView2);
        mTextView.setText(cyclist.getCategory() + " Watts");
    }

    // bind the wattage range to a list view
    public void doSubmitEffort(View v){
        //get effort
        RadioGroup g = (RadioGroup) findViewById(R.id.radioGroupEffort);
        int ndx = g.indexOfChild(findViewById(g.getCheckedRadioButtonId()));
        cyclist.setEffort(ndx);

        setContentView(R.layout.activity_show_watts);
        TextView mTextView = (TextView) findViewById(R.id.textView3);
        mTextView.setText(cyclist.getCategory() + " " + getEffortString(cyclist.getEffort()) + " Watts");

        ArrayList<ArrayList> totalWattData = getSelectedCyclingCategoryWatts(cyclist.getCategory());

        ArrayList listEffort = totalWattData.get(cyclist.getEffort());
        ArrayList<String> modifiedList = parseDouble(listEffort);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modifiedList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }

    //return the selected category
    @SuppressWarnings("unchecked")
    private ArrayList<ArrayList> getSelectedCyclingCategoryWatts(String category){
        if(cyclist.getGender() == 0){
            switch (category)
            {
                case "Pro":
                    return mensWattData.getProWattData(cyclist.getWeight());
                case "Domestic Pro":
                    return mensWattData.getDomesticProWattData(cyclist.getWeight());
                case "Cat 1":
                    return mensWattData.getCat1WattData(cyclist.getWeight());
                case "Cat 2":
                    return mensWattData.getCat2WattData(cyclist.getWeight());
                case "Cat 3":
                    return mensWattData.getCat3WattData(cyclist.getWeight());
                case "Cat 4":
                    return mensWattData.getCat4WattData(cyclist.getWeight());
                case "Cat 5":
                    return mensWattData.getCat5WattData(cyclist.getWeight());
                case "Recreational":
                    return mensWattData.getRecWattData(cyclist.getWeight());
                default:
                    return new ArrayList<>();
            }
        }else{
            switch (category)
            {
                case "Pro":
                    return womensWattData.getProWattData(cyclist.getWeight());
                case "Domestic Pro":
                    return womensWattData.getDomesticProWattData(cyclist.getWeight());
                case "Cat 1":
                    return womensWattData.getCat1WattData(cyclist.getWeight());
                case "Cat 2":
                    return womensWattData.getCat2WattData(cyclist.getWeight());
                case "Cat 3":
                    return womensWattData.getCat3WattData(cyclist.getWeight());
                case "Cat 4":
                    return womensWattData.getCat4WattData(cyclist.getWeight());
                case "Cat 5":
                    return womensWattData.getCat5WattData(cyclist.getWeight());
                case "Recreational":
                    return womensWattData.getRecWattData(cyclist.getWeight());
                default:
                    return new ArrayList<>();
            }
        }


    }

    // parse the wattage value to show only the whole number
    private ArrayList parseDouble(ArrayList arrayList){
        ArrayList<String> arString = new ArrayList<String>();
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i).toString();
            String[] parts = s.split("\\.");
            arString.add(i,parts[0]);
        }
        return arString;
    }

    // screen navigation
    public void doBack_from_show_watts(View v){
        setContentView(R.layout.activity_show_effort);
        setEffortView();
    }

    public void doBack_from_show_effort(View v){
        setContentView(R.layout.activity_select_level);
        setCategoryView();
    }

    public void doBack_from_select_level(View v){
        setContentView(R.layout.activity_input_weight);
        setWeightView();
    }

    // upon Back button, ensure the previously selected effort is shown as selected
    private void setEffortView(){
        RadioGroup g = (RadioGroup)findViewById(R.id.radioGroupEffort);
        RadioButton rb = (RadioButton)g.getChildAt(cyclist.getEffort());
        rb.setChecked(true);
    }

    // upon Back button, ensure the previously selected category is shown as selected
    private void setCategoryView(){
        int ndx = 0;
        RadioGroup g = (RadioGroup)findViewById(R.id.radioGroupCategory);
        switch(cyclist.getCategory())
        {
            case "Pro":
                ndx = 0;
                break;

            case "Domestic Pro":
                ndx = 1;
                break;

            case "Cat 1":
                ndx = 2;
                break;

            case "Cat 2":
                ndx = 3;
                break;

            case "Cat 3":
                ndx = 4;
                break;

            case "Cat 4":
                ndx = 5;
                break;

            case "Cat 5":
                ndx = 6;
                break;

            case "Recreational":
                ndx = 7;
                break;
        }
        RadioButton rb = (RadioButton)g.getChildAt(ndx);
        rb.setChecked(true);
    }

    // set header text in activity_show_effort
    private String getEffortString(int effort){
        switch(effort)
        {
            case 0:
            return "5 second max";

            case 1:
            return "1 minute average";

            case 2:
            return "5 minute average";

            case 3:
            return "functional threshold";
        }
        return "";
    }

    private void setWeightView(){
        RadioButton rb;

        if(cyclist.getWeightUnit() == KILOGRAMS){
            rb = (RadioButton)findViewById(R.id.radioKilogram);
            rb.setChecked(true);
        }else{
            rb = (RadioButton)findViewById(R.id.radioPound);
            rb.setChecked(true);
        }

        EditText et = (EditText)findViewById(R.id.editText);
        et.setText(cyclist.getWeightString());

        //set gender to model
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGender);

        if(cyclist.getGender() == 0){
            radioGroup.check(R.id.radioMale);
        }else{
            radioGroup.check(R.id.radioFemale);
        }

        Button button = (Button)findViewById(R.id.button);
        button.setEnabled(true);
        setAddTextListener();
    }

    // little ditty to look inside the cyclist vo
    private String inspectCyclist(){
        return  "category: " + this.cyclist.getCategory() + " " +
                "effort: " + this.cyclist.getEffort() + " " +
                "gender: " + this.cyclist.getGender() + " " +
                "weight(dbl): " + this.cyclist.getWeight() + " " +
                "weight(str): " + this.cyclist.getWeightString() + " " +
                "units: " + this.cyclist.getWeightUnit();

    }

    public void doFoo(View v){
        Log.d("do", " foo");
    }

    public void setAboutContent(){
        TextView textView = (TextView) findViewById(R.id.address1);
        textView.setText(this.aboutText);
    }
}
