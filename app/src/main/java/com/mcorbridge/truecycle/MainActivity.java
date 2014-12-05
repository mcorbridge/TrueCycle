package com.mcorbridge.truecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.mcorbridge.truecycle.data.men.ProWattData;

import java.util.ArrayList;
import java.util.Iterator;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProWattData proWattData = new ProWattData();
        proWattData.setCyclistWeightKg(85.0);
        ArrayList proData = proWattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        for (int i = 0; i < proData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) proData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
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
}
