package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class DomesticProWattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    public void DomesticProWattData(){

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

    /* 22.14    21.86    21.59   21.32  21.05   20.78    20.51  20.23 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,22.14*cyclistWeightKg);
        fiveSecMaxRange.add(1,21.86*cyclistWeightKg);
        fiveSecMaxRange.add(2,21.59*cyclistWeightKg);
        fiveSecMaxRange.add(3,21.32*cyclistWeightKg);
        fiveSecMaxRange.add(4,21.05*cyclistWeightKg);
        fiveSecMaxRange.add(5,20.78*cyclistWeightKg);
        fiveSecMaxRange.add(6,20.51*cyclistWeightKg);
        fiveSecMaxRange.add(7,20.23*cyclistWeightKg);

        return fiveSecMaxRange;
    }
    /* 10.7	    10.58	10.47	10.35	10.24	10.12	10.01	9.89 */
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,10.7*cyclistWeightKg);
        oneMinMaxRange.add(1,10.58*cyclistWeightKg);
        oneMinMaxRange.add(2,10.47*cyclistWeightKg);
        oneMinMaxRange.add(3,10.35*cyclistWeightKg);
        oneMinMaxRange.add(4,10.24*cyclistWeightKg);
        oneMinMaxRange.add(5,10.12*cyclistWeightKg);
        oneMinMaxRange.add(6,10.01*cyclistWeightKg);
        oneMinMaxRange.add(7,9.89*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 6.88	    6.77	6.67	6.57	6.46	6.36	6.26	6.15 */
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,6.88*cyclistWeightKg);
        fiveMinMaxRange.add(1,6.77*cyclistWeightKg);
        fiveMinMaxRange.add(2,6.67*cyclistWeightKg);
        fiveMinMaxRange.add(3,6.57*cyclistWeightKg);
        fiveMinMaxRange.add(4,6.46*cyclistWeightKg);
        fiveMinMaxRange.add(5,6.36*cyclistWeightKg);
        fiveMinMaxRange.add(6,6.26*cyclistWeightKg);
        fiveMinMaxRange.add(7,6.15*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 5.78 	5.69	5.6 	5.51	5.42	5.33	5.24	5.15 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,5.78*cyclistWeightKg);
        ftMaxRange.add(1,5.69*cyclistWeightKg);
        ftMaxRange.add(2,5.60*cyclistWeightKg);
        ftMaxRange.add(3,5.51*cyclistWeightKg);
        ftMaxRange.add(4,5.42*cyclistWeightKg);
        ftMaxRange.add(5,5.33*cyclistWeightKg);
        ftMaxRange.add(6,5.24*cyclistWeightKg);
        ftMaxRange.add(7,5.15*cyclistWeightKg);

        return ftMaxRange;
    }

}
