package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mcorbridge.truecycle.data.vo.Cyclist;
import com.mcorbridge.truecycle.util.BreadCrumb;

import java.io.Serializable;


public class EffortActivity extends Activity {

    private Cyclist cyclist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effort);

        savedInstanceState = getIntent().getExtras();
        Serializable serializable = savedInstanceState.getSerializable("CyclistVO");
        cyclist = (Cyclist)serializable;

        setBreadCrumb();
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

    public void submitEffort(View v){
        //get effort
        RadioGroup g = (RadioGroup) findViewById(R.id.radioGroupEffort);
        int ndx = g.indexOfChild(findViewById(g.getCheckedRadioButtonId()));
        cyclist.setEffort(ndx);

        Intent intent = new Intent(this, WattOutputActivity.class);
        intent.putExtra("CyclistVO",cyclist);
        startActivity(intent);
    }

    private void setBreadCrumb(){
        TextView textView = (TextView) findViewById(R.id.breadcrumb);
        String breadcrumb = BreadCrumb.getGenderString(cyclist.getGender()) + "/" +
                cyclist.getWeightString() + "" +
                BreadCrumb.getUnitAbbrev(cyclist.getWeightUnit()) + "/" +
                cyclist.getCategory();
        textView.setText(breadcrumb);
    }
}
