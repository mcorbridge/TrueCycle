package com.mcorbridge.truecycle.data.women;

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
    16.83	16.62	16.4	16.19	15.97	15.76	15.54	15.32
    8.2	    8.11	8.02	7.93	7.84	7.75	7.66	7.57
    5.5	    5.41	5.31	5.22	5.13	5.04	4.94	4.85
    4.7	    4.62	4.54	4.46	4.38	4.29	4.21	4.13
     */

    /* 16.62	16.4	16.19	15.97	15.76	15.54	15.32	15.11*/
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,16.62*cyclistWeightKg);
        fiveSecMaxRange.add(1,16.4*cyclistWeightKg);
        fiveSecMaxRange.add(2,16.19*cyclistWeightKg);
        fiveSecMaxRange.add(3,15.97*cyclistWeightKg);
        fiveSecMaxRange.add(4,15.76*cyclistWeightKg);
        fiveSecMaxRange.add(5,15.54*cyclistWeightKg);
        fiveSecMaxRange.add(6,15.32*cyclistWeightKg);
        fiveSecMaxRange.add(7,15.11*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 8.11	    8.02	7.93	7.84	7.75	7.66	7.57	7.48 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,8.11*cyclistWeightKg);
        oneMinAvgRange.add(1,8.02*cyclistWeightKg);
        oneMinAvgRange.add(2,7.93*cyclistWeightKg);
        oneMinAvgRange.add(3,7.84*cyclistWeightKg);
        oneMinAvgRange.add(4,7.75*cyclistWeightKg);
        oneMinAvgRange.add(5,7.66*cyclistWeightKg);
        oneMinAvgRange.add(6,7.57*cyclistWeightKg);
        oneMinAvgRange.add(7,7.48*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 5.41 	5.31	5.22	5.13	5.04	4.94	4.85	4.76 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,5.41*cyclistWeightKg);
        fiveMinAvgRange.add(1,5.31*cyclistWeightKg);
        fiveMinAvgRange.add(2,5.22*cyclistWeightKg);
        fiveMinAvgRange.add(3,5.13*cyclistWeightKg);
        fiveMinAvgRange.add(4,5.04*cyclistWeightKg);
        fiveMinAvgRange.add(5,4.94*cyclistWeightKg);
        fiveMinAvgRange.add(6,4.85*cyclistWeightKg);
        fiveMinAvgRange.add(7,4.76*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 4.62	    4.54	4.46	4.38	4.29	4.21	4.13	4.05 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(04.62*cyclistWeightKg);
        ftAvgRange.add(1,4.54*cyclistWeightKg);
        ftAvgRange.add(2,4.46*cyclistWeightKg);
        ftAvgRange.add(3,4.38*cyclistWeightKg);
        ftAvgRange.add(4,4.29*cyclistWeightKg);
        ftAvgRange.add(5,4.21*cyclistWeightKg);
        ftAvgRange.add(6,4.13*cyclistWeightKg);
        ftAvgRange.add(7,4.05*cyclistWeightKg);

        return ftAvgRange;
    }

}
