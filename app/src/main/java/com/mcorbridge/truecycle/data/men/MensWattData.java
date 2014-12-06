package com.mcorbridge.truecycle.data.men;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Mike on 12/5/2014.
 */
public class MensWattData {

    public Double cyclistWeight;

    public void MensWattData(){

    }

    public void setCyclistWeight(Double cyclistWeight){
        this.cyclistWeight = cyclistWeight;
    }


    public void getProWattData(){
        ProWattData proWattData = new ProWattData();
        proWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = proWattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  " Pro --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getDomesticProWattData(){
        DomesticProWattData domesticProWattData = new DomesticProWattData();
        domesticProWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = domesticProWattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Domestic Pro --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getCat1WattData(){
        Cat1WattData cat1WattData = new Cat1WattData();
        cat1WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat1WattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Cat 1 --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }
}
