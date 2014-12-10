package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat5WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    Cat5WattData(){

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
    14.25	13.98	13.71	13.44	13.16	12.89	12.62	12.35
    7.36	7.25	7.13	7.02	6.9	    6.79	6.67	6.56
    3.88	3.77	3.67	3.57	3.46	3.36	3.26	3.15
    3.2	    3.11	3.02	2.93	2.84	2.75	2.66	2.58
     */

   /* 14.25 	13.98	13.71	13.44	13.16	12.89	12.62	12.35 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,14.25*cyclistWeightKg);
        fiveSecMaxRange.add(1,13.98*cyclistWeightKg);
        fiveSecMaxRange.add(2,13.71*cyclistWeightKg);
        fiveSecMaxRange.add(3,13.44*cyclistWeightKg);
        fiveSecMaxRange.add(4,13.16*cyclistWeightKg);
        fiveSecMaxRange.add(5,12.89*cyclistWeightKg);
        fiveSecMaxRange.add(6,12.62*cyclistWeightKg);
        fiveSecMaxRange.add(7,12.35*cyclistWeightKg);

        return fiveSecMaxRange;
    }

   /*  7.36	    7.25	7.13	7.02	6.9	    6.79	6.67	6.56 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,7.36*cyclistWeightKg);
        oneMinAvgRange.add(1,7.25*cyclistWeightKg);
        oneMinAvgRange.add(2,7.13*cyclistWeightKg);
        oneMinAvgRange.add(3,7.02*cyclistWeightKg);
        oneMinAvgRange.add(4,6.9*cyclistWeightKg);
        oneMinAvgRange.add(5,6.79*cyclistWeightKg);
        oneMinAvgRange.add(6,6.67*cyclistWeightKg);
        oneMinAvgRange.add(7,6.56*cyclistWeightKg);

        return oneMinAvgRange;
    }

   /*  3.88	    3.77	3.67	3.57	3.46	3.36	3.26	3.15 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,3.88*cyclistWeightKg);
        fiveMinAvgRange.add(1,3.77*cyclistWeightKg);
        fiveMinAvgRange.add(2,3.67*cyclistWeightKg);
        fiveMinAvgRange.add(3,3.57*cyclistWeightKg);
        fiveMinAvgRange.add(4,3.46*cyclistWeightKg);
        fiveMinAvgRange.add(5,3.36*cyclistWeightKg);
        fiveMinAvgRange.add(6,3.26*cyclistWeightKg);
        fiveMinAvgRange.add(7,3.15*cyclistWeightKg);

        return fiveMinAvgRange;
    }

/*  3.2	   3.11	3.02	2.93	2.84	2.75	2.66	2.58 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,3.2*cyclistWeightKg);
        ftAvgRange.add(1,3.11*cyclistWeightKg);
        ftAvgRange.add(2,3.02*cyclistWeightKg);
        ftAvgRange.add(3,2.93*cyclistWeightKg);
        ftAvgRange.add(4,2.84*cyclistWeightKg);
        ftAvgRange.add(5,2.75*cyclistWeightKg);
        ftAvgRange.add(6,2.66*cyclistWeightKg);
        ftAvgRange.add(7,2.58*cyclistWeightKg);

        return ftAvgRange;
    }

}
