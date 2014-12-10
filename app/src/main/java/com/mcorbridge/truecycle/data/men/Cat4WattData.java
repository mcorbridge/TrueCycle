package com.mcorbridge.truecycle.data.men;

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
    15.88	15.61	15.34	15.07	14.79	14.52	14.25	13.98
    8.05	7.94	7.82	7.71	7.59	7.48	7.36	7.25
    4.5	    4.39	4.29	4.19	4.08	3.98	3.88	3.77
    3.73	3.64	3.55	3.47	3.38	3.29	3.2	    3.11
     */

    /* 15.88	15.61	15.34	15.07	14.79	14.52	14.25	13.98 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,15.88*cyclistWeightKg);
        fiveSecMaxRange.add(1,15.61*cyclistWeightKg);
        fiveSecMaxRange.add(2,15.34*cyclistWeightKg);
        fiveSecMaxRange.add(3,15.07*cyclistWeightKg);
        fiveSecMaxRange.add(4,14.79*cyclistWeightKg);
        fiveSecMaxRange.add(5,14.52*cyclistWeightKg);
        fiveSecMaxRange.add(6,14.25*cyclistWeightKg);
        fiveSecMaxRange.add(7,13.98*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 8.05 	7.94	7.82	7.71	7.59	7.48	7.36	7.25 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,8.05*cyclistWeightKg);
        oneMinAvgRange.add(1,7.94*cyclistWeightKg);
        oneMinAvgRange.add(2,7.82*cyclistWeightKg);
        oneMinAvgRange.add(3,7.71*cyclistWeightKg);
        oneMinAvgRange.add(4,7.59*cyclistWeightKg);
        oneMinAvgRange.add(5,7.48*cyclistWeightKg);
        oneMinAvgRange.add(6,7.36*cyclistWeightKg);
        oneMinAvgRange.add(7,7.25*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /*  4.5	    4.39	4.29	4.19	4.08	3.98	3.88	3.77 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,4.5*cyclistWeightKg);
        fiveMinAvgRange.add(1,4.39*cyclistWeightKg);
        fiveMinAvgRange.add(2,4.29*cyclistWeightKg);
        fiveMinAvgRange.add(3,4.19*cyclistWeightKg);
        fiveMinAvgRange.add(4,4.08*cyclistWeightKg);
        fiveMinAvgRange.add(5,3.98*cyclistWeightKg);
        fiveMinAvgRange.add(6,3.88*cyclistWeightKg);
        fiveMinAvgRange.add(7,3.77*cyclistWeightKg);

        return fiveMinAvgRange;
    }

   /*  3.73 	3.64	3.55	3.47	3.38	3.29	3.2	    3.11 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,3.73*cyclistWeightKg);
        ftAvgRange.add(1,3.64*cyclistWeightKg);
        ftAvgRange.add(2,3.55*cyclistWeightKg);
        ftAvgRange.add(3,3.47*cyclistWeightKg);
        ftAvgRange.add(4,3.38*cyclistWeightKg);
        ftAvgRange.add(5,3.29*cyclistWeightKg);
        ftAvgRange.add(6,3.2*cyclistWeightKg);
        ftAvgRange.add(7,3.11*cyclistWeightKg);

        return ftAvgRange;
    }

}
