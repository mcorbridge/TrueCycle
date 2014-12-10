package com.mcorbridge.truecycle.data.women;

import com.mcorbridge.truecycle.data.women.Cat1WattData;
import com.mcorbridge.truecycle.data.women.Cat2WattData;
import com.mcorbridge.truecycle.data.women.Cat3WattData;
import com.mcorbridge.truecycle.data.women.Cat4WattData;
import com.mcorbridge.truecycle.data.women.Cat5WattData;
import com.mcorbridge.truecycle.data.women.DomesticProWattData;
import com.mcorbridge.truecycle.data.women.ProWattData;
import com.mcorbridge.truecycle.data.women.RecreationalWattData;

import java.util.ArrayList;

/**
 * Created by Mike on 12/5/2014.
 */
public class WomensWattData {


    public WomensWattData(){

    }


    public ArrayList getProWattData(Double cyclistWeight){
        ProWattData proWattData = new ProWattData();
        proWattData.setCyclistWeightKg(cyclistWeight);
        return proWattData.getWattData();
    }

    public ArrayList getDomesticProWattData(Double cyclistWeight){
        DomesticProWattData domesticProWattData = new DomesticProWattData();
        domesticProWattData.setCyclistWeightKg(cyclistWeight);
        return domesticProWattData.getWattData();
    }

    public ArrayList getCat1WattData(Double cyclistWeight){
        Cat1WattData cat1WattData = new Cat1WattData();
        cat1WattData.setCyclistWeightKg(cyclistWeight);
        return cat1WattData.getWattData();
    }

    public ArrayList getCat2WattData(Double cyclistWeight){
        Cat2WattData cat2WattData = new Cat2WattData();
        cat2WattData.setCyclistWeightKg(cyclistWeight);
        return cat2WattData.getWattData();
    }

    public ArrayList getCat3WattData(Double cyclistWeight){
        Cat3WattData cat3WattData = new Cat3WattData();
        cat3WattData.setCyclistWeightKg(cyclistWeight);
        return cat3WattData.getWattData();
    }

    public ArrayList getCat4WattData(Double cyclistWeight){
        Cat4WattData cat4WattData = new Cat4WattData();
        cat4WattData.setCyclistWeightKg(cyclistWeight);
        return cat4WattData.getWattData();
    }

    public ArrayList getCat5WattData(Double cyclistWeight){
        Cat5WattData cat5WattData = new Cat5WattData();
        cat5WattData.setCyclistWeightKg(cyclistWeight);
        return cat5WattData.getWattData();
    }

    public ArrayList getRecWattData(Double cyclistWeight){
        RecreationalWattData recreationalWattData = new RecreationalWattData();
        recreationalWattData.setCyclistWeightKg(cyclistWeight);
        return recreationalWattData.getWattData();
    }
}
