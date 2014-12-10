package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class RecreationalWattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(9);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(9);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(9);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(9);

    RecreationalWattData(){

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
    10.15	9.94	9.72	9.51	9.29	9.07	8.86	8.64	8.43
    5.39	5.3	    5.21	5.12	5.03	4.94	4.85	4.76	4.67
    5.39	2.54	2.45	2.35	2.26	2.17	2.07	1.98	1.89
    2.16	2.08	1.99	1.91	1.83	1.75	1.67	1.58	1.5
     */

    /* 10.15	9.94	9.72	9.51	9.29	9.07	8.86	8.64	8.43 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,10.15*cyclistWeightKg);
        fiveSecMaxRange.add(1,9.94*cyclistWeightKg);
        fiveSecMaxRange.add(2,9.72*cyclistWeightKg);
        fiveSecMaxRange.add(3,9.51*cyclistWeightKg);
        fiveSecMaxRange.add(4,9.29*cyclistWeightKg);
        fiveSecMaxRange.add(5,9.07*cyclistWeightKg);
        fiveSecMaxRange.add(6,8.86*cyclistWeightKg);
        fiveSecMaxRange.add(7,8.64*cyclistWeightKg);
        fiveSecMaxRange.add(8,8.43*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 5.39	    5.3	    5.21	5.12	5.03	4.94	4.85	4.76	4.67 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,5.39*cyclistWeightKg);
        oneMinAvgRange.add(1,5.3*cyclistWeightKg);
        oneMinAvgRange.add(2,5.21*cyclistWeightKg);
        oneMinAvgRange.add(3,5.12*cyclistWeightKg);
        oneMinAvgRange.add(4,5.03*cyclistWeightKg);
        oneMinAvgRange.add(5,4.94*cyclistWeightKg);
        oneMinAvgRange.add(6,4.85*cyclistWeightKg);
        oneMinAvgRange.add(7,4.76*cyclistWeightKg);
        oneMinAvgRange.add(8,4.67*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 5.39	    2.54	2.45	2.35	2.26	2.17	2.07	1.98	1.89 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,5.39*cyclistWeightKg);
        fiveMinAvgRange.add(1,2.54*cyclistWeightKg);
        fiveMinAvgRange.add(2,2.45*cyclistWeightKg);
        fiveMinAvgRange.add(3,2.35*cyclistWeightKg);
        fiveMinAvgRange.add(4,2.26*cyclistWeightKg);
        fiveMinAvgRange.add(5,2.17*cyclistWeightKg);
        fiveMinAvgRange.add(6,2.07*cyclistWeightKg);
        fiveMinAvgRange.add(7,1.98*cyclistWeightKg);
        fiveMinAvgRange.add(8,1.89*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /*  2.16	2.08	1.99	1.91	1.83	1.75	1.67	1.58	1.5 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,2.16*cyclistWeightKg);
        ftAvgRange.add(1,2.08*cyclistWeightKg);
        ftAvgRange.add(2,1.99*cyclistWeightKg);
        ftAvgRange.add(3,1.91*cyclistWeightKg);
        ftAvgRange.add(4,1.83*cyclistWeightKg);
        ftAvgRange.add(5,1.75*cyclistWeightKg);
        ftAvgRange.add(6,1.67*cyclistWeightKg);
        ftAvgRange.add(7,1.58*cyclistWeightKg);
        ftAvgRange.add(8,1.5*cyclistWeightKg);

        return ftAvgRange;
    }

}
