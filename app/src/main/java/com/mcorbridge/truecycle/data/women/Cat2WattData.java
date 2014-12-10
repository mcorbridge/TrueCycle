package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat2WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    Cat2WattData(){

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

    /* 15.11	14.89	14.68	14.46	14.25	14.03	13.82	13.6 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,15.11*cyclistWeightKg);
        fiveSecMaxRange.add(1,14.89*cyclistWeightKg);
        fiveSecMaxRange.add(2,14.68*cyclistWeightKg);
        fiveSecMaxRange.add(3,14.46*cyclistWeightKg);
        fiveSecMaxRange.add(4,14.25*cyclistWeightKg);
        fiveSecMaxRange.add(5,14.03*cyclistWeightKg);
        fiveSecMaxRange.add(6,13.82*cyclistWeightKg);
        fiveSecMaxRange.add(7,13.6*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 7.48	    7.39	7.3	    7.21	7.11	7.02	6.93	6.84*/
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,7.48*cyclistWeightKg);
        oneMinMaxRange.add(1,7.39*cyclistWeightKg);
        oneMinMaxRange.add(2,7.3*cyclistWeightKg);
        oneMinMaxRange.add(3,7.21*cyclistWeightKg);
        oneMinMaxRange.add(4,7.11*cyclistWeightKg);
        oneMinMaxRange.add(5,7.02*cyclistWeightKg);
        oneMinMaxRange.add(6,6.93*cyclistWeightKg);
        oneMinMaxRange.add(7,6.84*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 4.76	    4.67	4.57	4.48	4.39	4.3	    4.2	    4.11*/
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,4.76*cyclistWeightKg);
        fiveMinMaxRange.add(1,4.67*cyclistWeightKg);
        fiveMinMaxRange.add(2,4.57*cyclistWeightKg);
        fiveMinMaxRange.add(3,4.48*cyclistWeightKg);
        fiveMinMaxRange.add(4,4.39*cyclistWeightKg);
        fiveMinMaxRange.add(5,4.3*cyclistWeightKg);
        fiveMinMaxRange.add(6,4.2*cyclistWeightKg);
        fiveMinMaxRange.add(7,4.11*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 4.05	    3.97	3.88	3.8	3.72	3.64	3.55	3.47 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,4.05*cyclistWeightKg);
        ftMaxRange.add(1,3.97*cyclistWeightKg);
        ftMaxRange.add(2,3.88*cyclistWeightKg);
        ftMaxRange.add(3,3.8*cyclistWeightKg);
        ftMaxRange.add(4,3.72*cyclistWeightKg);
        ftMaxRange.add(5,3.64*cyclistWeightKg);
        ftMaxRange.add(6,3.55*cyclistWeightKg);
        ftMaxRange.add(7,3.47*cyclistWeightKg);

        return ftMaxRange;
    }
}
