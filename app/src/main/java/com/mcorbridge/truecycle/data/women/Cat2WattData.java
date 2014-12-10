package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat2WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    Cat2WattData(){

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
    15.54	15.32	15.11	14.89	14.68	14.46	14.25	14.03
    7.66	7.57	7.48	7.39	7.3	    7.21	7.11	7.02
    4.94	4.85	4.76	4.67	4.57	4.48	4.39	4.3
    4.21	4.13	4.05	3.97	3.88	3.8	    3.72	3.64
     */

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
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,7.48*cyclistWeightKg);
        oneMinAvgRange.add(1,7.39*cyclistWeightKg);
        oneMinAvgRange.add(2,7.3*cyclistWeightKg);
        oneMinAvgRange.add(3,7.21*cyclistWeightKg);
        oneMinAvgRange.add(4,7.11*cyclistWeightKg);
        oneMinAvgRange.add(5,7.02*cyclistWeightKg);
        oneMinAvgRange.add(6,6.93*cyclistWeightKg);
        oneMinAvgRange.add(7,6.84*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 4.76	    4.67	4.57	4.48	4.39	4.3	    4.2	    4.11*/
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,4.76*cyclistWeightKg);
        fiveMinAvgRange.add(1,4.67*cyclistWeightKg);
        fiveMinAvgRange.add(2,4.57*cyclistWeightKg);
        fiveMinAvgRange.add(3,4.48*cyclistWeightKg);
        fiveMinAvgRange.add(4,4.39*cyclistWeightKg);
        fiveMinAvgRange.add(5,4.3*cyclistWeightKg);
        fiveMinAvgRange.add(6,4.2*cyclistWeightKg);
        fiveMinAvgRange.add(7,4.11*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 4.05	    3.97	3.88	3.8	3.72	3.64	3.55	3.47 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,4.05*cyclistWeightKg);
        ftAvgRange.add(1,3.97*cyclistWeightKg);
        ftAvgRange.add(2,3.88*cyclistWeightKg);
        ftAvgRange.add(3,3.8*cyclistWeightKg);
        ftAvgRange.add(4,3.72*cyclistWeightKg);
        ftAvgRange.add(5,3.64*cyclistWeightKg);
        ftAvgRange.add(6,3.55*cyclistWeightKg);
        ftAvgRange.add(7,3.47*cyclistWeightKg);

        return ftAvgRange;
    }
}
