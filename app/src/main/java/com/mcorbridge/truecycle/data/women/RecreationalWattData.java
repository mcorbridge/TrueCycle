package com.mcorbridge.truecycle.data.women;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class RecreationalWattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftMaxRange = new ArrayList<Double>(8);

    RecreationalWattData(){

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

    /* 12.08	11.8	11.53	11.26	10.99	10.72	10.44	10.17 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,12.08*cyclistWeightKg);
        fiveSecMaxRange.add(1,11.8*cyclistWeightKg);
        fiveSecMaxRange.add(2,11.53*cyclistWeightKg);
        fiveSecMaxRange.add(3,11.26*cyclistWeightKg);
        fiveSecMaxRange.add(4,10.99*cyclistWeightKg);
        fiveSecMaxRange.add(5,10.72*cyclistWeightKg);
        fiveSecMaxRange.add(6,10.44*cyclistWeightKg);
        fiveSecMaxRange.add(7,10.17*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 6.44	6.33	6.21	6.1	5.99	5.87	5.76	5.64 */
    public ArrayList<Double> getOneMinMaxRange(Double cyclistWeightKg){
        oneMinMaxRange.add(0,6.44*cyclistWeightKg);
        oneMinMaxRange.add(1,6.33*cyclistWeightKg);
        oneMinMaxRange.add(2,6.21*cyclistWeightKg);
        oneMinMaxRange.add(3,6.1*cyclistWeightKg);
        oneMinMaxRange.add(4,5.99*cyclistWeightKg);
        oneMinMaxRange.add(5,5.87*cyclistWeightKg);
        oneMinMaxRange.add(6,5.76*cyclistWeightKg);
        oneMinMaxRange.add(7,5.64*cyclistWeightKg);

        return oneMinMaxRange;
    }

    /* 3.05	2.95	2.84	2.74	2.64	2.53	2.43	2.33 */
    public ArrayList<Double> getFiveMinMaxRange(Double cyclistWeightKg){
        fiveMinMaxRange.add(0,3.05*cyclistWeightKg);
        fiveMinMaxRange.add(1,2.95*cyclistWeightKg);
        fiveMinMaxRange.add(2,2.84*cyclistWeightKg);
        fiveMinMaxRange.add(3,2.74*cyclistWeightKg);
        fiveMinMaxRange.add(4,2.64*cyclistWeightKg);
        fiveMinMaxRange.add(5,2.53*cyclistWeightKg);
        fiveMinMaxRange.add(6,2.43*cyclistWeightKg);
        fiveMinMaxRange.add(7,2.33*cyclistWeightKg);

        return fiveMinMaxRange;
    }

    /* 2.49	2.4	2.31	2.22	2.13	2.04	1.95	1.86 */
    public ArrayList<Double> getFtMaxRange(Double cyclistWeightKg){
        ftMaxRange.add(0,2.49*cyclistWeightKg);
        ftMaxRange.add(1,2.4*cyclistWeightKg);
        ftMaxRange.add(2,2.31*cyclistWeightKg);
        ftMaxRange.add(3,2.22*cyclistWeightKg);
        ftMaxRange.add(4,2.13*cyclistWeightKg);
        ftMaxRange.add(5,2.04*cyclistWeightKg);
        ftMaxRange.add(6,1.95*cyclistWeightKg);
        ftMaxRange.add(7,1.86*cyclistWeightKg);

        return ftMaxRange;
    }

}
