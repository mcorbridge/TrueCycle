package com.mcorbridge.truecycle.data.men;

import java.util.ArrayList;

/**
 * Created by Mike on 12/4/2014.
 */
public class DomesticProWattData {

    public Double cyclistWeightKg;

    public ArrayList<Double> fiveSecMaxRange = new ArrayList<Double>(8);
    public ArrayList<Double> oneMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> fiveMinAvgRange = new ArrayList<Double>(8);
    public ArrayList<Double> ftAvgRange = new ArrayList<Double>(8);

    public void DomesticProWattData(){

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
    22.41	22.14	21.86	21.59	21.32	21.05	20.78	20.51
    10.81	10.7	10.58	10.47	10.35	10.24	10.12	10.01
    6.98	6.88	6.77	6.67	6.57	6.46	6.36	6.26
    5.87	5.78	5.69	5.6	    5.51	5.42	5.33	5.24
    */

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
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,10.7*cyclistWeightKg);
        oneMinAvgRange.add(1,10.58*cyclistWeightKg);
        oneMinAvgRange.add(2,10.47*cyclistWeightKg);
        oneMinAvgRange.add(3,10.35*cyclistWeightKg);
        oneMinAvgRange.add(4,10.24*cyclistWeightKg);
        oneMinAvgRange.add(5,10.12*cyclistWeightKg);
        oneMinAvgRange.add(6,10.01*cyclistWeightKg);
        oneMinAvgRange.add(7,9.89*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 6.88	    6.77	6.67	6.57	6.46	6.36	6.26	6.15 */
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,6.88*cyclistWeightKg);
        fiveMinAvgRange.add(1,6.77*cyclistWeightKg);
        fiveMinAvgRange.add(2,6.67*cyclistWeightKg);
        fiveMinAvgRange.add(3,6.57*cyclistWeightKg);
        fiveMinAvgRange.add(4,6.46*cyclistWeightKg);
        fiveMinAvgRange.add(5,6.36*cyclistWeightKg);
        fiveMinAvgRange.add(6,6.26*cyclistWeightKg);
        fiveMinAvgRange.add(7,6.15*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 5.78 	5.69	5.6 	5.51	5.42	5.33	5.24	5.15 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,5.78*cyclistWeightKg);
        ftAvgRange.add(1,5.69*cyclistWeightKg);
        ftAvgRange.add(2,5.60*cyclistWeightKg);
        ftAvgRange.add(3,5.51*cyclistWeightKg);
        ftAvgRange.add(4,5.42*cyclistWeightKg);
        ftAvgRange.add(5,5.33*cyclistWeightKg);
        ftAvgRange.add(6,5.24*cyclistWeightKg);
        ftAvgRange.add(7,5.15*cyclistWeightKg);

        return ftAvgRange;
    }

}
