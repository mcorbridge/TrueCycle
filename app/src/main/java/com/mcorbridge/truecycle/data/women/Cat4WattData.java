package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat4WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    Cat4WattData(){

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
    12.95	12.74	12.52	12.31	12.09	11.88	11.66	11.45
    6.57	6.48	6.39	6.3	    6.21	6.12	6.03	5.94
    3.83	3.74	3.65	3.56	3.46	3.37	6.03	5.94
    3.23	3.14	3.06	2.98	2.9	    2.82	2.73	2.65
     */


    /* 11.66	11.45	11.23	11.01	10.8	10.58	10.37	10.15 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,15.61*cyclistWeightKg);
        fiveSecMaxRange.add(1,15.34*cyclistWeightKg);
        fiveSecMaxRange.add(2,15.07*cyclistWeightKg);
        fiveSecMaxRange.add(3,14.79*cyclistWeightKg);
        fiveSecMaxRange.add(4,14.52*cyclistWeightKg);
        fiveSecMaxRange.add(5,14.25*cyclistWeightKg);
        fiveSecMaxRange.add(6,13.98*cyclistWeightKg);
        fiveSecMaxRange.add(7,13.71*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 6.03 	5.94	5.85	5.76	5.66	5.57	5.48	5.39 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,7.94*cyclistWeightKg);
        oneMinAvgRange.add(1,7.82*cyclistWeightKg);
        oneMinAvgRange.add(2,7.71*cyclistWeightKg);
        oneMinAvgRange.add(3,7.59*cyclistWeightKg);
        oneMinAvgRange.add(4,7.48*cyclistWeightKg);
        oneMinAvgRange.add(5,7.36*cyclistWeightKg);
        oneMinAvgRange.add(6,7.25*cyclistWeightKg);
        oneMinAvgRange.add(7,7.13*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 6.03 	5.94	5.85	5.76	5.66	5.57	5.48	5.39 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,4.39*cyclistWeightKg);
        fiveMinAvgRange.add(1,4.29*cyclistWeightKg);
        fiveMinAvgRange.add(2,4.19*cyclistWeightKg);
        fiveMinAvgRange.add(3,4.08*cyclistWeightKg);
        fiveMinAvgRange.add(4,3.98*cyclistWeightKg);
        fiveMinAvgRange.add(5,3.88*cyclistWeightKg);
        fiveMinAvgRange.add(6,3.77*cyclistWeightKg);
        fiveMinAvgRange.add(7,3.67*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 2.73	    2.65	2.57	2.49	2.4	2.32	2.24	2.16 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,3.64*cyclistWeightKg);
        ftAvgRange.add(1,3.55*cyclistWeightKg);
        ftAvgRange.add(2,3.47*cyclistWeightKg);
        ftAvgRange.add(3,3.38*cyclistWeightKg);
        ftAvgRange.add(4,3.29*cyclistWeightKg);
        ftAvgRange.add(5,3.2*cyclistWeightKg);
        ftAvgRange.add(6,3.11*cyclistWeightKg);
        ftAvgRange.add(7,3.02*cyclistWeightKg);

        return ftAvgRange;
    }

}
