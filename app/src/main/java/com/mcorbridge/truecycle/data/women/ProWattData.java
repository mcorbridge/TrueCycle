package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class ProWattData {



    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    public ProWattData(){

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

    public Double convertPoundToKilo(Double pounds){
        return pounds * 0.453592;
    }

    /* 19.42	19.2	18.99	18.77	18.56	18.34	18.13	17.91 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,19.42*cyclistWeightKg);
        fiveSecMaxRange.add(1,19.2*cyclistWeightKg);
        fiveSecMaxRange.add(2,18.99*cyclistWeightKg);
        fiveSecMaxRange.add(3,18.77*cyclistWeightKg);
        fiveSecMaxRange.add(4,18.56*cyclistWeightKg);
        fiveSecMaxRange.add(5,18.34*cyclistWeightKg);
        fiveSecMaxRange.add(6,18.13*cyclistWeightKg);
        fiveSecMaxRange.add(7,17.91*cyclistWeightKg);

        return fiveSecMaxRange;
    }
   /*  9.29	    9.2 	9.11	9.02	8.93	8.84	8.75	8.66 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,9.29*cyclistWeightKg);
        oneMinAvgRange.add(1,9.2*cyclistWeightKg);
        oneMinAvgRange.add(2,9.11*cyclistWeightKg);
        oneMinAvgRange.add(3,9.02*cyclistWeightKg);
        oneMinAvgRange.add(4,8.93*cyclistWeightKg);
        oneMinAvgRange.add(5,8.84*cyclistWeightKg);
        oneMinAvgRange.add(6,8.75*cyclistWeightKg);
        oneMinAvgRange.add(7,8.66*cyclistWeightKg);

        return oneMinAvgRange;
    }
   /*  6.61 	6.52	6.42	6.33	6.24	6.15	6.05	5.96 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,6.61*cyclistWeightKg);
        fiveMinAvgRange.add(1,6.52*cyclistWeightKg);
        fiveMinAvgRange.add(2,6.42*cyclistWeightKg);
        fiveMinAvgRange.add(3,6.33*cyclistWeightKg);
        fiveMinAvgRange.add(4,6.24*cyclistWeightKg);
        fiveMinAvgRange.add(5,6.15*cyclistWeightKg);
        fiveMinAvgRange.add(6,6.05*cyclistWeightKg);
        fiveMinAvgRange.add(7,5.96*cyclistWeightKg);

        return fiveMinAvgRange;
    }
   /* 5.69	    5.61	5.53	5.44	5.36	5.28	5.2	    5.12 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,5.69*cyclistWeightKg);
        ftAvgRange.add(1,5.61*cyclistWeightKg);
        ftAvgRange.add(2,5.53*cyclistWeightKg);
        ftAvgRange.add(3,5.44*cyclistWeightKg);
        ftAvgRange.add(4,5.36*cyclistWeightKg);
        ftAvgRange.add(5,5.28*cyclistWeightKg);
        ftAvgRange.add(6,5.2*cyclistWeightKg);
        ftAvgRange.add(7,5.12*cyclistWeightKg);

        return ftAvgRange;
    }
}
