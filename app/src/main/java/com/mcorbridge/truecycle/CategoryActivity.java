package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.mcorbridge.truecycle.data.vo.Cyclist;

import java.io.Serializable;


public class CategoryActivity extends Activity {

    private Cyclist cyclist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        savedInstanceState = getIntent().getExtras();
        Serializable serializable = savedInstanceState.getSerializable("CyclistVO");
        cyclist = (Cyclist)serializable;

        Log.d("CyclistVO getGender -------------->", Integer.toString(cyclist.getGender()));
        Log.d("CyclistVO getWeightUnit -------------->", cyclist.getWeightUnit());
        Log.d("CyclistVO getWeightString -------------->", cyclist.getWeightString());
        Log.d("CyclistVO getWeight -------------->", String.valueOf(cyclist.getWeight()));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category, menu);
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

    public void submitCategory(View v){
        RadioGroup g = (RadioGroup) findViewById(R.id.radioGroupCategory);
        int selected = g.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        cyclist.setCategory(b.getText().toString());

        Intent intent = new Intent(this, EffortActivity.class);
        intent.putExtra("CyclistVO",cyclist);
        startActivity(intent);
    }
}
