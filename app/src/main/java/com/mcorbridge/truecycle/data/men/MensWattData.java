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


    public ArrayList getProWattData(){
        ProWattData proWattData = new ProWattData();
        proWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = proWattData.getWattData();

        return wattData;
    }

    public ArrayList getDomesticProWattData(){
        DomesticProWattData domesticProWattData = new DomesticProWattData();
        domesticProWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = domesticProWattData.getWattData();

        return wattData;
    }

    public ArrayList getCat1WattData(){
        Cat1WattData cat1WattData = new Cat1WattData();
        cat1WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat1WattData.getWattData();

        return wattData;
    }

    public ArrayList getCat2WattData(){
        Cat2WattData cat2WattData = new Cat2WattData();
        cat2WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat2WattData.getWattData();

        return wattData;
    }

    public ArrayList getCat3WattData(){
        Cat3WattData cat3WattData = new Cat3WattData();
        cat3WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat3WattData.getWattData();

        return wattData;
    }

    public ArrayList getCat4WattData(){
        Cat4WattData cat4WattData = new Cat4WattData();
        cat4WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat4WattData.getWattData();

        return wattData;
    }

    public ArrayList getCat5WattData(){
        Cat5WattData cat5WattData = new Cat5WattData();
        cat5WattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = cat5WattData.getWattData();

        return wattData;
    }

    public ArrayList getRecWattData(){
        RecreationalWattData recreationalWattData = new RecreationalWattData();
        recreationalWattData.setCyclistWeightKg(cyclistWeight);
        ArrayList wattData = recreationalWattData.getWattData();

        return wattData;
    }
}
