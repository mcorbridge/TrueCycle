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

import java.util.ArrayList;


public class MainActivity extends Activity {

    private final static String MALE = "male";
    private final static String FEMALE = "female";
    private final static String KILOGRAMS = "kilograms";
    private final static String POUNDS = "pounds";

    private Cyclist cyclist;

    private ArrayList proWattData;
    private ArrayList domesticProWattData;
    private ArrayList cat1WattData;
    private ArrayList cat2WattData;
    private ArrayList cat3WattData;
    private ArrayList cat4WattData;
    private ArrayList cat5WattData;
    private ArrayList recWattData;

    private String currentCategory;
    private String currentLevel;

    NumberPicker np1;
    NumberPicker np2;
    NumberPicker np3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
            getMensWattData(dblWeight);
        }else{
            cyclist.setWeightUnit(this.POUNDS);
            getMensWattData(dblWeight * 0.453592);
        }
    }

    public void getMensWattData(Double cyclistWeight){
        MensWattData mensWattData = new MensWattData();
        mensWattData.setCyclistWeight(cyclistWeight);
        proWattData = mensWattData.getProWattData();
        domesticProWattData = mensWattData.getDomesticProWattData();
        cat1WattData = mensWattData.getCat1WattData();
        cat2WattData = mensWattData.getCat2WattData();
        cat3WattData = mensWattData.getCat3WattData();
        cat4WattData = mensWattData.getCat4WattData();
        cat5WattData = mensWattData.getCat5WattData();
        recWattData =  mensWattData.getRecWattData();
        setContentView(R.layout.activity_select_level);
    }

    public void doSubmitCategory(View v){
        RadioGroup g = (RadioGroup) findViewById(R.id.radioGroupCategory);
        int selected = g.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        currentCategory = b.getText().toString();
        setContentView(R.layout.activity_show_effort);
        TextView mTextView = (TextView) findViewById(R.id.textView2);
        mTextView.setText(currentCategory + " Watts");
    }

    // bind the wattage range to a list view
    public void doSubmitEffort(View v){
        setContentView(R.layout.activity_show_watts);
        TextView mTextView = (TextView) findViewById(R.id.textView3);
        mTextView.setText(currentCategory + " Watts");

        getSelectedCyclingCategory();

        ArrayList list5secMax = (ArrayList)proWattData.get(0);
        ArrayList<String> modifiedList = parseDouble(list5secMax);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modifiedList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }

    //return the selected category
    private void getSelectedCyclingCategory(){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupCategory);
        int i = radioGroup.getCheckedRadioButtonId();
        Log.d("************* getCheckedRadioButtonId", String.valueOf(i) );
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

}
