package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.mcorbridge.truecycle.data.vo.Cyclist;

import java.io.Serializable;


public class GenderWeightActivity extends Activity {


    private final static String KILOGRAMS = "kilograms";
    private final static String POUNDS = "pounds";

    private Cyclist cyclist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_weight);

        savedInstanceState = getIntent().getExtras();
        Serializable serializable = savedInstanceState.getSerializable("CyclistVO");
        cyclist = (Cyclist)serializable;

        EditText mEdit = (EditText)findViewById(R.id.editText);
        mEdit.requestFocus();
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(mEdit, InputMethodManager.SHOW_FORCED);

        setAddTextListener();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gender_weight, menu);
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

    // user selects gender and inputs weight
    public void submitGenderWeight(View v){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGender);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        View radioButton = radioGroup.findViewById(radioButtonID);
        int ndx = radioGroup.indexOfChild(radioButton);

        // set gender (int)
        cyclist.setGender(ndx);

        EditText mEdit = (EditText)findViewById(R.id.editText);
        Integer intWeight = Integer.parseInt(mEdit.getText().toString());
        Double dblWeight = (double)intWeight;

        RadioButton rb = (RadioButton)findViewById(R.id.radioKilogram);

        //set weight (double) and weight unit (string)
        if(rb.isChecked()){
            cyclist.setWeightUnit(KILOGRAMS);
            cyclist.setWeight(dblWeight);
        }else{
            cyclist.setWeightUnit(POUNDS);
            cyclist.setWeight(dblWeight * 0.453592);
        }

        //set weight string - for display of  weight(dbl) as a string
        cyclist.setWeightString(mEdit.getText().toString());

        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra("CyclistVO",cyclist);
        startActivity(intent);

    }
}
