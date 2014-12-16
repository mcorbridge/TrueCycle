package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class AboutActivity extends Activity {

    String aboutText = "This app is based on data collected by Dr. Andy Coggan, a cycling coach at TrainingPeaks (trainingpeaks.com), and an author of 'Training and Racing with a Power Meter'." +
            "This is the most widely accepted and referenced benchmark for power output based on rider category.\n\n " +
            "Note that a cyclist may not measure consistently within the separate categories. This means that although a cyclist can generate listed wattage within one category " +
            "(for example, 5 sec max), they may average higher/lower in others.\n\n" +
            "Using the app is relatively straightforward.  Enter (or select) the appropriate parameters to view a range of watts at a specific effort for the required athletic level." +
            "Navigate between the screens to adjust the values to review wattage ranges for different cyclist weight, category and effort";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView = (TextView) findViewById(R.id.address1);
        textView.setText(this.aboutText);
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
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_home:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_about:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_contact:
                intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
