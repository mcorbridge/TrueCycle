package com.mcorbridge.truecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mcorbridge.truecycle.adapters.CustomAdapter;
import com.mcorbridge.truecycle.data.men.MensWattData;
import com.mcorbridge.truecycle.data.vo.Cyclist;
import com.mcorbridge.truecycle.data.women.WomensWattData;

import java.io.Serializable;
import java.util.ArrayList;


public class WattOutputActivity extends Activity {

    private Cyclist cyclist;
    private MensWattData mensWattData;
    private WomensWattData womensWattData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watt_output);

        savedInstanceState = getIntent().getExtras();
        Serializable serializable = savedInstanceState.getSerializable("CyclistVO");
        cyclist = (Cyclist)serializable;
        Log.d("********************************", "*********************************");
        Log.d("CyclistVO getGender -------------->", Integer.toString(cyclist.getGender()));
        Log.d("CyclistVO getWeightUnit -------------->", cyclist.getWeightUnit());
        Log.d("CyclistVO getWeightString -------------->", cyclist.getWeightString());
        Log.d("CyclistVO getWeight -------------->", String.valueOf(cyclist.getWeight()));
        Log.d("CyclistVO getCategory -------------->", cyclist.getCategory());
        Log.d("CyclistVO getEffort -------------->", Integer.toString(cyclist.getEffort()));

        mensWattData = new MensWattData();
        womensWattData = new WomensWattData();

        bindWattDataToList();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_watt_output, menu);
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

    private void bindWattDataToList(){
        ArrayList<ArrayList> totalWattData = getSelectedCyclingCategoryWatts(cyclist.getCategory());

        ArrayList listEffort = totalWattData.get(cyclist.getEffort());
        ArrayList<String> modifiedList = parseDouble(listEffort);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modifiedList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        final CustomAdapter adapter = new CustomAdapter(this, modifiedList);
        listView.setAdapter(adapter);
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


}
