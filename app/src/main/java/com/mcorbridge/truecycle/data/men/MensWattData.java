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

    public void getCat2WattData(){
        Cat2WattData cat2WattData = new Cat2WattData();
        cat2WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat2WattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Cat 2 --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getCat3WattData(){
        Cat3WattData cat3WattData = new Cat3WattData();
        cat3WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat3WattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Cat 3 --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getCat4WattData(){
        Cat4WattData cat4WattData = new Cat4WattData();
        cat4WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat4WattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Cat 4 --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getCat5WattData(){
        Cat5WattData cat5WattData = new Cat5WattData();
        cat5WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat5WattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Cat 5 --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }

    public void getRecWattData(){
        RecreationalWattData recreationalWattData = new RecreationalWattData();
        recreationalWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = recreationalWattData.getWattData();

        ArrayList<String> wattCategories = new ArrayList<String>(4);
        wattCategories.add(0, "5 second max range");
        wattCategories.add(1, "1 minute max range");
        wattCategories.add(2, "5 minute max range");
        wattCategories.add(3, "functional threshold range");

        Log.d("-------------------- ",  "Recreational --------------------");
        for (int i = 0; i < wattData.size(); i++) {
            Log.d("-------------------- ", wattCategories.get(i) + " --------------------");
            ArrayList wattRange = (ArrayList) wattData.get(i);
            for (int n = 0; n < wattRange.size(); n++) {
                Log.d("", wattRange.get(n).toString());
            }
        }
    }
}
