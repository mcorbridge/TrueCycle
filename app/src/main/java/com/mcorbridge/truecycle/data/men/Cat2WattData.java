package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat2WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    Cat2WattData(){

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

    /* 19.15	18.87	18.6	18.33	18.06	17.79	17.51	17.24 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,19.15*cyclistWeightKg);
        fiveSecMaxRange.add(1,18.87*cyclistWeightKg);
        fiveSecMaxRange.add(2,18.6*cyclistWeightKg);
        fiveSecMaxRange.add(3,18.33*cyclistWeightKg);
        fiveSecMaxRange.add(4,18.06*cyclistWeightKg);
        fiveSecMaxRange.add(5,17.79*cyclistWeightKg);
        fiveSecMaxRange.add(6,17.51*cyclistWeightKg);
        fiveSecMaxRange.add(7,17.24*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 9.43	9.32	9.2	9.09	8.97	8.86	8.74	8.63*/
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,9.43*cyclistWeightKg);
        oneMinMaxRange.add(1,9.32*cyclistWeightKg);
        oneMinMaxRange.add(2,9.2*cyclistWeightKg);
        oneMinMaxRange.add(3,9.09*cyclistWeightKg);
        oneMinMaxRange.add(4,8.97*cyclistWeightKg);
        oneMinMaxRange.add(5,8.86*cyclistWeightKg);
        oneMinMaxRange.add(6,8.74*cyclistWeightKg);
        oneMinMaxRange.add(7,8.63*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 5.74	5.64	5.53	5.43	5.33	5.22	5.12	5.01*/
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,5.74*cyclistWeightKg);
        fiveMinMaxRange.add(1,5.64*cyclistWeightKg);
        fiveMinMaxRange.add(2,5.53*cyclistWeightKg);
        fiveMinMaxRange.add(3,5.43*cyclistWeightKg);
        fiveMinMaxRange.add(4,5.33*cyclistWeightKg);
        fiveMinMaxRange.add(5,5.22*cyclistWeightKg);
        fiveMinMaxRange.add(6,5.12*cyclistWeightKg);
        fiveMinMaxRange.add(7,5.01*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 4.8	4.71	4.62	4.53	4.44	4.35	4.27	4.18*/
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,4.8*cyclistWeightKg);
        ftMaxRange.add(1,4.71*cyclistWeightKg);
        ftMaxRange.add(2,4.62*cyclistWeightKg);
        ftMaxRange.add(3,4.53*cyclistWeightKg);
        ftMaxRange.add(4,4.44*cyclistWeightKg);
        ftMaxRange.add(5,4.35*cyclistWeightKg);
        ftMaxRange.add(6,4.27*cyclistWeightKg);
        ftMaxRange.add(7,4.18*cyclistWeightKg);

        return ftMaxRange;
    }

}
