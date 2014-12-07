package com.mcorbridge.truecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mcorbridge.truecycle.data.men.MensWattData;

import java.util.ArrayList;


public class MainActivity extends Activity {


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
        setContentView(R.layout.activity_input_weight);
    }

    public void doSubmit(View v){
        EditText mEdit = (EditText)findViewById(R.id.editText);
        Integer intWeight = Integer.parseInt(mEdit.getText().toString());
        Double dblWeight = (double)intWeight;

        if(findViewById(R.id.radioKilogram).isSelected()){
            getMensWattData(dblWeight);
        }else{
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

    public void doSubmitEffort(View v){
        setContentView(R.layout.activity_show_watts);
        TextView mTextView = (TextView) findViewById(R.id.textView3);
        mTextView.setText(currentCategory + " Watts");

        // 5 wec max
        ArrayList list5secMax = (ArrayList)proWattData.get(0);

        ArrayList<String> modifiedList = parseDouble(list5secMax);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modifiedList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }

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
