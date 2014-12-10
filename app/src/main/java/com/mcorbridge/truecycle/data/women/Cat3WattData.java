package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat3WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    Cat3WattData(){

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
    14.25	14.03	13.82	13.6	13.39	13.17	12.95	12.74
    7.11	7.02	6.93	6.84	6.75	6.66	6.57	6.48
    4.39	4.3	    4.2	    4.11	4.02	3.93	3.83	3.74
    3.72	3.64	3.55	3.47	3.39	3.31	3.23	3.14
     */


    /* 13.39	13.17	12.95	12.74	12.52	12.31	12.09	11.88*/
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,13.39*cyclistWeightKg);
        fiveSecMaxRange.add(1,13.17*cyclistWeightKg);
        fiveSecMaxRange.add(2,12.95*cyclistWeightKg);
        fiveSecMaxRange.add(3,12.74*cyclistWeightKg);
        fiveSecMaxRange.add(4,12.52*cyclistWeightKg);
        fiveSecMaxRange.add(5,12.31*cyclistWeightKg);
        fiveSecMaxRange.add(6,12.09*cyclistWeightKg);
        fiveSecMaxRange.add(7,11.88*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /*  6.75	6.66	6.57	6.48	6.39	6.3 	6.21	6.12*/
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,6.75*cyclistWeightKg);
        oneMinAvgRange.add(1,6.66*cyclistWeightKg);
        oneMinAvgRange.add(2,6.57*cyclistWeightKg);
        oneMinAvgRange.add(3,6.48*cyclistWeightKg);
        oneMinAvgRange.add(4,6.39*cyclistWeightKg);
        oneMinAvgRange.add(5,6.3*cyclistWeightKg);
        oneMinAvgRange.add(6,6.21*cyclistWeightKg);
        oneMinAvgRange.add(7,6.12*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 4.02	    3.93	3.83	3.74	3.65	3.56	3.46	3.37*/
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,4.02*cyclistWeightKg);
        fiveMinAvgRange.add(1,3.93*cyclistWeightKg);
        fiveMinAvgRange.add(2,3.83*cyclistWeightKg);
        fiveMinAvgRange.add(3,3.74*cyclistWeightKg);
        fiveMinAvgRange.add(4,3.65*cyclistWeightKg);
        fiveMinAvgRange.add(5,3.56*cyclistWeightKg);
        fiveMinAvgRange.add(6,3.46*cyclistWeightKg);
        fiveMinAvgRange.add(7,3.37*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 3.39 	3.31	3.23	3.14	3.06	2.98	2.9	    2.82 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,3.39*cyclistWeightKg);
        ftAvgRange.add(1,3.31*cyclistWeightKg);
        ftAvgRange.add(2,3.23*cyclistWeightKg);
        ftAvgRange.add(3,3.14*cyclistWeightKg);
        ftAvgRange.add(4,3.06*cyclistWeightKg);
        ftAvgRange.add(5,2.98*cyclistWeightKg);
        ftAvgRange.add(6,2.9*cyclistWeightKg);
        ftAvgRange.add(7,2.82*cyclistWeightKg);

        return ftAvgRange;
    }


}
