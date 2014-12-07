package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat4WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    Cat4WattData(){

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

    public Double convertPoundToKilo(Double pounds){
        return pounds * 0.453592;
    }

    /* 15.61	15.34	15.07	14.79	14.52	14.25	13.98	13.71 */
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

    /* 7.94	7.82	7.71	7.59	7.48	7.36	7.25	7.13 */
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,7.94*cyclistWeightKg);
        oneMinMaxRange.add(1,7.82*cyclistWeightKg);
        oneMinMaxRange.add(2,7.71*cyclistWeightKg);
        oneMinMaxRange.add(3,7.59*cyclistWeightKg);
        oneMinMaxRange.add(4,7.48*cyclistWeightKg);
        oneMinMaxRange.add(5,7.36*cyclistWeightKg);
        oneMinMaxRange.add(6,7.25*cyclistWeightKg);
        oneMinMaxRange.add(7,7.13*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 4.39	4.29	4.19	4.08	3.98	3.88	3.77	3.67 */
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,4.39*cyclistWeightKg);
        fiveMinMaxRange.add(1,4.29*cyclistWeightKg);
        fiveMinMaxRange.add(2,4.19*cyclistWeightKg);
        fiveMinMaxRange.add(3,4.08*cyclistWeightKg);
        fiveMinMaxRange.add(4,3.98*cyclistWeightKg);
        fiveMinMaxRange.add(5,3.88*cyclistWeightKg);
        fiveMinMaxRange.add(6,3.77*cyclistWeightKg);
        fiveMinMaxRange.add(7,3.67*cyclistWeightKg);

        return fiveMinMaxRange;
    }

   /*  3.64	3.55	3.47	3.38	3.29	3.2	3.11	3.02 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,3.64*cyclistWeightKg);
        ftMaxRange.add(1,3.55*cyclistWeightKg);
        ftMaxRange.add(2,3.47*cyclistWeightKg);
        ftMaxRange.add(3,3.38*cyclistWeightKg);
        ftMaxRange.add(4,3.29*cyclistWeightKg);
        ftMaxRange.add(5,3.2*cyclistWeightKg);
        ftMaxRange.add(6,3.11*cyclistWeightKg);
        ftMaxRange.add(7,3.02*cyclistWeightKg);

        return ftMaxRange;
    }

}
