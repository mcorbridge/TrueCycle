package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat5WattData {
    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    Cat5WattData(){

    }

    public void setCyclistWeightKg(double cyclistWeightKg){
        this.cyclistWeightKg = cyclistWeightKg;
    }

    public ArrayList<ArrayList> getWattData(){
        ArrayList<Double> n = getFiveSecMaxRange(cyclistWeightKg);
        ArrayList<Double> m = getOneMinMaxRange(cyclistWeightKg);
        ArrayList<Double> p = getFiveMinMaxRange(cyclistWeightKg);
        ArrayList<Double> q = getFtMaxRange(cyclistWeightKg);

        ArrayList<ArrayList> a = new ArrayList<ArrayList>(4);
        a.add(n);
        a.add(m);
        a.add(p);
        a.add(q);

        return a;
    }

    /* 13.98	 13.71	13.44	13.16	12.89	12.62	12.35	12.08 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,13.98*cyclistWeightKg);
        fiveSecMaxRange.add(1,13.71*cyclistWeightKg);
        fiveSecMaxRange.add(2,13.44*cyclistWeightKg);
        fiveSecMaxRange.add(3,13.16*cyclistWeightKg);
        fiveSecMaxRange.add(4,12.89*cyclistWeightKg);
        fiveSecMaxRange.add(5,12.62*cyclistWeightKg);
        fiveSecMaxRange.add(6,12.35*cyclistWeightKg);
        fiveSecMaxRange.add(7,12.08*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 7.25	7.13	7.02	6.9	6.79	6.67	6.56	6.44 */
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,7.25*cyclistWeightKg);
        oneMinMaxRange.add(1,7.13*cyclistWeightKg);
        oneMinMaxRange.add(2,7.02*cyclistWeightKg);
        oneMinMaxRange.add(3,6.9*cyclistWeightKg);
        oneMinMaxRange.add(4,6.79*cyclistWeightKg);
        oneMinMaxRange.add(5,6.67*cyclistWeightKg);
        oneMinMaxRange.add(6,6.56*cyclistWeightKg);
        oneMinMaxRange.add(7,6.44*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 3.77	3.67	3.57	3.46	3.36	3.26	3.15	3.05 */
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,3.77*cyclistWeightKg);
        fiveMinMaxRange.add(1,3.67*cyclistWeightKg);
        fiveMinMaxRange.add(2,3.57*cyclistWeightKg);
        fiveMinMaxRange.add(3,3.46*cyclistWeightKg);
        fiveMinMaxRange.add(4,3.36*cyclistWeightKg);
        fiveMinMaxRange.add(5,3.26*cyclistWeightKg);
        fiveMinMaxRange.add(6,3.15*cyclistWeightKg);
        fiveMinMaxRange.add(7,3.05*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 3.11	3.02	2.93	2.84	2.75	2.66	2.58	2.49 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,3.11*cyclistWeightKg);
        ftMaxRange.add(1,3.02*cyclistWeightKg);
        ftMaxRange.add(2,2.93*cyclistWeightKg);
        ftMaxRange.add(3,2.84*cyclistWeightKg);
        ftMaxRange.add(4,2.75*cyclistWeightKg);
        ftMaxRange.add(5,2.66*cyclistWeightKg);
        ftMaxRange.add(6,2.58*cyclistWeightKg);
        ftMaxRange.add(7,2.49*cyclistWeightKg);

        return ftMaxRange;
    }
}
