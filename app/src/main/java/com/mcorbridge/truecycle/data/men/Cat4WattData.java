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
        fiveSecMaxRange.add(0,24.04*cyclistWeightKg);
        fiveSecMaxRange.add(1,23.77*cyclistWeightKg);
        fiveSecMaxRange.add(2,23.50*cyclistWeightKg);
        fiveSecMaxRange.add(3,23.22*cyclistWeightKg);
        fiveSecMaxRange.add(4,22.95*cyclistWeightKg);
        fiveSecMaxRange.add(5,22.68*cyclistWeightKg);
        fiveSecMaxRange.add(6,22.41*cyclistWeightKg);
        fiveSecMaxRange.add(7,22.14*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 7.94	7.82	7.71	7.59	7.48	7.36	7.25	7.13 */
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,11.50*cyclistWeightKg);
        oneMinMaxRange.add(1,11.39*cyclistWeightKg);
        oneMinMaxRange.add(2,11.27*cyclistWeightKg);
        oneMinMaxRange.add(3,11.16*cyclistWeightKg);
        oneMinMaxRange.add(4,11.04*cyclistWeightKg);
        oneMinMaxRange.add(5,10.93*cyclistWeightKg);
        oneMinMaxRange.add(6,10.81*cyclistWeightKg);
        oneMinMaxRange.add(7,10.70*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 4.39	4.29	4.19	4.08	3.98	3.88	3.77	3.67 */
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,7.60*cyclistWeightKg);
        fiveMinMaxRange.add(1,7.50*cyclistWeightKg);
        fiveMinMaxRange.add(2,7.39*cyclistWeightKg);
        fiveMinMaxRange.add(3,7.29*cyclistWeightKg);
        fiveMinMaxRange.add(4,7.19*cyclistWeightKg);
        fiveMinMaxRange.add(5,7.08*cyclistWeightKg);
        fiveMinMaxRange.add(6,6.98*cyclistWeightKg);
        fiveMinMaxRange.add(7,6.88*cyclistWeightKg);

        return fiveMinMaxRange;
    }

   /*  3.64	3.55	3.47	3.38	3.29	3.2	3.11	3.02 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,6.40*cyclistWeightKg);
        ftMaxRange.add(1,6.31*cyclistWeightKg);
        ftMaxRange.add(2,6.22*cyclistWeightKg);
        ftMaxRange.add(3,6.13*cyclistWeightKg);
        ftMaxRange.add(4,6.04*cyclistWeightKg);
        ftMaxRange.add(5,5.96*cyclistWeightKg);
        ftMaxRange.add(6,5.87*cyclistWeightKg);
        ftMaxRange.add(7,5.78*cyclistWeightKg);

        return ftMaxRange;
    }

}
