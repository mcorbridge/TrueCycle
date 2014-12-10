package com.mcorbridge.truecycle.data.men;

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
    12.35	12.08	11.8	11.53	11.26	10.99	10.72	10.44	10.17
    6.56	6.44	6.33	6.21	6.1	    5.99	5.87	5.76	5.64
    3.15	3.05	2.95	2.84	2.74	2.64	2.53	2.43	2.33
    2.58	2.49	2.4	    2.31	2.22	2.13	2.04	1.95	1.86
    */

    /*  12.35	12.08	11.8	11.53	11.26	10.99	10.72	10.44	10.17 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,12.35*cyclistWeightKg);
        fiveSecMaxRange.add(1,12.08*cyclistWeightKg);
        fiveSecMaxRange.add(2,11.8*cyclistWeightKg);
        fiveSecMaxRange.add(3,11.53*cyclistWeightKg);
        fiveSecMaxRange.add(4,11.26*cyclistWeightKg);
        fiveSecMaxRange.add(5,10.99*cyclistWeightKg);
        fiveSecMaxRange.add(6,10.72*cyclistWeightKg);
        fiveSecMaxRange.add(7,10.44*cyclistWeightKg);
        fiveSecMaxRange.add(8,10.17*cyclistWeightKg);

        return fiveSecMaxRange;
    }

    /* 6.56	    6.44	6.33	6.21	6.1	    5.99	5.87	5.76	5.64 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,6.56*cyclistWeightKg);
        oneMinAvgRange.add(1,6.44*cyclistWeightKg);
        oneMinAvgRange.add(2,6.33*cyclistWeightKg);
        oneMinAvgRange.add(3,6.21*cyclistWeightKg);
        oneMinAvgRange.add(4,6.1*cyclistWeightKg);
        oneMinAvgRange.add(5,5.99*cyclistWeightKg);
        oneMinAvgRange.add(6,5.87*cyclistWeightKg);
        oneMinAvgRange.add(7,5.76*cyclistWeightKg);
        oneMinAvgRange.add(8,5.64*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 3.15	    3.05	2.95	2.84	2.74	2.64	2.53	2.43	2.33 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,3.15*cyclistWeightKg);
        fiveMinAvgRange.add(1,3.05*cyclistWeightKg);
        fiveMinAvgRange.add(2,2.95*cyclistWeightKg);
        fiveMinAvgRange.add(3,2.84*cyclistWeightKg);
        fiveMinAvgRange.add(4,2.74*cyclistWeightKg);
        fiveMinAvgRange.add(5,2.64*cyclistWeightKg);
        fiveMinAvgRange.add(6,2.53*cyclistWeightKg);
        fiveMinAvgRange.add(7,2.43*cyclistWeightKg);
        fiveMinAvgRange.add(8,2.33*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 2.58	    2.49	2.4	    2.31	2.22	2.13	2.04	1.95	1.86 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,2.58*cyclistWeightKg);
        ftAvgRange.add(1,2.49*cyclistWeightKg);
        ftAvgRange.add(2,2.4*cyclistWeightKg);
        ftAvgRange.add(3,2.31*cyclistWeightKg);
        ftAvgRange.add(4,2.22*cyclistWeightKg);
        ftAvgRange.add(5,2.13*cyclistWeightKg);
        ftAvgRange.add(6,2.04*cyclistWeightKg);
        ftAvgRange.add(7,1.95*cyclistWeightKg);
        ftAvgRange.add(8,1.86*cyclistWeightKg);

        return ftAvgRange;
    }

}
