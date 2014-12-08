package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class Cat3WattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    Cat3WattData(){

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


    /* 17.51	17.24	16.97	16.7	16.43	16.15	15.88	15.61*/
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,17.51*cyclistWeightKg);
        fiveSecMaxRange.add(1,17.24*cyclistWeightKg);
        fiveSecMaxRange.add(2,16.97*cyclistWeightKg);
        fiveSecMaxRange.add(3,16.7*cyclistWeightKg);
        fiveSecMaxRange.add(4,16.43*cyclistWeightKg);
        fiveSecMaxRange.add(5,16.15*cyclistWeightKg);
        fiveSecMaxRange.add(6,15.88*cyclistWeightKg);
        fiveSecMaxRange.add(7,15.61*cyclistWeightKg);

        return fiveSecMaxRange;
    }

   /*  8.74	8.63	8.51	8.4	8.28	8.17	8.05	7.94*/
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,8.74*cyclistWeightKg);
        oneMinMaxRange.add(1,8.63*cyclistWeightKg);
        oneMinMaxRange.add(2,8.51*cyclistWeightKg);
        oneMinMaxRange.add(3,8.4*cyclistWeightKg);
        oneMinMaxRange.add(4,8.28*cyclistWeightKg);
        oneMinMaxRange.add(5,8.17*cyclistWeightKg);
        oneMinMaxRange.add(6,8.05*cyclistWeightKg);
        oneMinMaxRange.add(7,7.94*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 5.12	5.01	4.91	4.81	4.7	4.6	4.5	4.39*/
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,5.12*cyclistWeightKg);
        fiveMinMaxRange.add(1,5.01*cyclistWeightKg);
        fiveMinMaxRange.add(2,4.91*cyclistWeightKg);
        fiveMinMaxRange.add(3,4.81*cyclistWeightKg);
        fiveMinMaxRange.add(4,4.7*cyclistWeightKg);
        fiveMinMaxRange.add(5,4.6*cyclistWeightKg);
        fiveMinMaxRange.add(6,4.5*cyclistWeightKg);
        fiveMinMaxRange.add(7,4.39*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 4.27	4.18	4.09	4	3.91	3.82	3.73	3.64 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,4.27*cyclistWeightKg);
        ftMaxRange.add(1,4.18*cyclistWeightKg);
        ftMaxRange.add(2,4.09*cyclistWeightKg);
        ftMaxRange.add(3,4.0*cyclistWeightKg);
        ftMaxRange.add(4,3.91*cyclistWeightKg);
        ftMaxRange.add(5,3.82*cyclistWeightKg);
        ftMaxRange.add(6,3.73*cyclistWeightKg);
        ftMaxRange.add(7,3.64*cyclistWeightKg);

        return ftMaxRange;
    }

}
