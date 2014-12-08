package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mcorbridge.truecycle.data.men.MensWattData;
import com.mcorbridge.truecycle.data.vo.Cyclist;
import com.mcorbridge.truecycle.exceptions.CyclistWeightNotProvidedException;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends Activity {

    private final static String MALE = "male";
    private final static String FEMALE = "female";
    private final static String KILOGRAMS = "kilograms";
    private final static String POUNDS = "pounds";

    private Cyclist cyclist;

    private MensWattData mensWattData;

    NumberPicker np1;
    NumberPicker np2;
    NumberPicker np3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mensWattData = new MensWattData();

        setContentView(R.layout.activity_main);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doViewInputWeight(View v){
        // create new vo for the cyclist
        cyclist = new Cyclist();
        //TODO add gender
        cyclist.setGender(MALE);

        setContentView(R.layout.activity_input_weight);

        EditText mEdit = (EditText)findViewById(R.id.editText);
        mEdit.requestFocus();
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(mEdit, InputMethodManager.SHOW_FORCED);
        //setNumberPickerValues();
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
        EditText mEdit = (EditText)findViewById(R.id.editText);
        Integer intWeight = Integer.parseInt(mEdit.getText().toString());
        Double dblWeight = (double)intWeight;

        cyclist.setWeight(dblWeight);

        RadioButton radioButton = (RadioButton)findViewById(R.id.radioKilogram);

        if(radioButton.isChecked()){
            cyclist.setWeightUnit(this.KILOGRAMS);
            cyclist.setWeight(dblWeight);
        }else{
            cyclist.setWeightUnit(this.POUNDS);
            cyclist.setWeight(dblWeight * 0.453592);
        }
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
        mTextView.setText(cyclist.getCategory() + " Watts*");

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

    public void doBack_from_show_watts(View v){
        setContentView(R.layout.activity_show_effort);
        Log.d("cyclist vo ", inspectCyclist());
    }

    public void doBack_from_show_effort(View v){
        setContentView(R.layout.activity_select_level);
        Log.d("cyclist vo ", inspectCyclist());
    }

    public void doBack_from_select_level(View v){
        setContentView(R.layout.activity_input_weight);
        Log.d("cyclist vo ", inspectCyclist());
    }

    private String inspectCyclist(){
        return this.cyclist.getWeight() + " " + this.cyclist.getEffort() + " " + this.cyclist.getCategory() + " " + this.cyclist.getGender() + " " + this.cyclist.getWeightUnit();
    }


}
