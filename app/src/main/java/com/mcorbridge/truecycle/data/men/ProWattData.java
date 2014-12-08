package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 * done!
 */
public class ProWattData {



    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    public void ProWattData(){

    }

    public void setCyclistWeightKg(double cyclistWeightKg){
        this.cyclistWeightKg = cyclistWeightKg;
    }

    public ArrayList<ArrayList> getWattData(){
        ArrayList<Double> n = getFiveSecMaxRange(cyclistWeightKg);
        ArrayList<Double> m = getOneMinAvgRange(cyclistWeightKg);
        ArrayList<Double> p = getFiveMinAvgRange(cyclistWeightKg);
        ArrayList<Double> q = getFtAvgRange(cyclistWeightKg);

        ArrayList<ArrayList> a = new ArrayList<ArrayList>(4);
        a.add(n);
        a.add(m);
        a.add(p);
        a.add(q);

        return a;
    }

    public Double convertPoundToKilo(Double pounds){
        return pounds * 0.453592;
    }


    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,24.04*cyclistWeightKg);
        fiveSecMaxRange.add(1,23.77*cyclistWeightKg);
        fiveSecMaxRange.add(2,23.5*cyclistWeightKg);
        fiveSecMaxRange.add(3,23.22*cyclistWeightKg);
        fiveSecMaxRange.add(4,22.95*cyclistWeightKg);
        fiveSecMaxRange.add(5,22.68*cyclistWeightKg);
        fiveSecMaxRange.add(6,22.41*cyclistWeightKg);
        fiveSecMaxRange.add(7,22.14*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,11.50*cyclistWeightKg);
        oneMinAvgRange.add(1,11.39*cyclistWeightKg);
        oneMinAvgRange.add(2,11.27*cyclistWeightKg);
        oneMinAvgRange.add(3,11.16*cyclistWeightKg);
        oneMinAvgRange.add(4,11.04*cyclistWeightKg);
        oneMinAvgRange.add(5,10.93*cyclistWeightKg);
        oneMinAvgRange.add(6,10.81*cyclistWeightKg);
        oneMinAvgRange.add(7,10.70*cyclistWeightKg);

        return oneMinAvgRange;
    }

    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,7.60*cyclistWeightKg);
        fiveMinAvgRange.add(1,7.50*cyclistWeightKg);
        fiveMinAvgRange.add(2,7.39*cyclistWeightKg);
        fiveMinAvgRange.add(3,7.29*cyclistWeightKg);
        fiveMinAvgRange.add(4,7.19*cyclistWeightKg);
        fiveMinAvgRange.add(5,7.08*cyclistWeightKg);
        fiveMinAvgRange.add(6,6.98*cyclistWeightKg);
        fiveMinAvgRange.add(7,6.88*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,6.40*cyclistWeightKg);
        ftAvgRange.add(1,6.31*cyclistWeightKg);
        ftAvgRange.add(2,6.22*cyclistWeightKg);
        ftAvgRange.add(3,6.13*cyclistWeightKg);
        ftAvgRange.add(4,6.04*cyclistWeightKg);
        ftAvgRange.add(5,5.96*cyclistWeightKg);
        ftAvgRange.add(6,5.87*cyclistWeightKg);
        ftAvgRange.add(7,5.78*cyclistWeightKg);

        return ftAvgRange;
    }

}
