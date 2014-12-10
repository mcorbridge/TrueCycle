package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat1WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    Cat1WattData(){

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

    /*
    20.78	20.51	20.23	19.96	19.69	19.42	19.15	18.87
    10.12	10.01	9.89	9.78	9.66	9.55	9.43	9.32
    6.36	6.26	6.15	6.05	5.95	5.84	5.74	5.64
    5.33	5.24	5.15	5.07	4.98	4.89	4.8	    4.71
     */

    /* 20.78	20.51	20.23	19.96	19.69	19.42	19.15	18.87 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,20.78*cyclistWeightKg);
        fiveSecMaxRange.add(1,20.51*cyclistWeightKg);
        fiveSecMaxRange.add(2,20.23*cyclistWeightKg);
        fiveSecMaxRange.add(3,19.96*cyclistWeightKg);
        fiveSecMaxRange.add(4,19.69*cyclistWeightKg);
        fiveSecMaxRange.add(5,19.42*cyclistWeightKg);
        fiveSecMaxRange.add(6,19.15*cyclistWeightKg);
        fiveSecMaxRange.add(7,18.87*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 10.12	10.01	9.89	9.78	9.66	9.55	9.43	9.32 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,10.12*cyclistWeightKg);
        oneMinAvgRange.add(1,10.01*cyclistWeightKg);
        oneMinAvgRange.add(2,9.89*cyclistWeightKg);
        oneMinAvgRange.add(3,9.78*cyclistWeightKg);
        oneMinAvgRange.add(4,9.66*cyclistWeightKg);
        oneMinAvgRange.add(5,9.55*cyclistWeightKg);
        oneMinAvgRange.add(6,9.43*cyclistWeightKg);
        oneMinAvgRange.add(7,9.32*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 6.36	6.26	6.15	6.05	5.95	5.84	5.74	5.64 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,6.36*cyclistWeightKg);
        fiveMinAvgRange.add(1,6.26*cyclistWeightKg);
        fiveMinAvgRange.add(2,6.15*cyclistWeightKg);
        fiveMinAvgRange.add(3,6.05*cyclistWeightKg);
        fiveMinAvgRange.add(4,5.95*cyclistWeightKg);
        fiveMinAvgRange.add(5,5.84*cyclistWeightKg);
        fiveMinAvgRange.add(6,5.74*cyclistWeightKg);
        fiveMinAvgRange.add(7,5.64*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 5.33	5.24	5.15	5.07	4.98	4.89	4.8	4.71 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,5.33*cyclistWeightKg);
        ftAvgRange.add(1,5.24*cyclistWeightKg);
        ftAvgRange.add(2,5.15*cyclistWeightKg);
        ftAvgRange.add(3,5.07*cyclistWeightKg);
        ftAvgRange.add(4,4.98*cyclistWeightKg);
        ftAvgRange.add(5,4.89*cyclistWeightKg);
        ftAvgRange.add(6,4.8*cyclistWeightKg);
        ftAvgRange.add(7,4.71*cyclistWeightKg);

        return ftAvgRange;
    }

}
