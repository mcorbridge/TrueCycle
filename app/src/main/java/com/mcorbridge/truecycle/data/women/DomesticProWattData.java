package com.mcorbridge.truecycle.data.women;

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

    public Double convertPoundToKilo(Double pounds){
        return pounds * 0.453592;
    }

    /* 18.13	17.91	17.7	17.48	17.26	17.05	16.83	16.62 */
    public ArrayList<Double> getFiveSecMaxRange(Double cyclistWeightKg){
        fiveSecMaxRange.add(0,18.13*cyclistWeightKg);
        fiveSecMaxRange.add(1,17.91*cyclistWeightKg);
        fiveSecMaxRange.add(2,17.7*cyclistWeightKg);
        fiveSecMaxRange.add(3,17.48*cyclistWeightKg);
        fiveSecMaxRange.add(4,17.26*cyclistWeightKg);
        fiveSecMaxRange.add(5,17.05*cyclistWeightKg);
        fiveSecMaxRange.add(6,16.83*cyclistWeightKg);
        fiveSecMaxRange.add(7,16.62*cyclistWeightKg);

        return fiveSecMaxRange;
    }
    /* 8.75	    8.66	8.56	8.47	8.38	8.29	8.2	    8.11 */
    public ArrayList<Double> getOneMinAvgRange(Double cyclistWeightKg){
        oneMinAvgRange.add(0,8.75*cyclistWeightKg);
        oneMinAvgRange.add(1,8.66*cyclistWeightKg);
        oneMinAvgRange.add(2,8.56*cyclistWeightKg);
        oneMinAvgRange.add(3,8.47*cyclistWeightKg);
        oneMinAvgRange.add(4,8.38*cyclistWeightKg);
        oneMinAvgRange.add(5,8.29*cyclistWeightKg);
        oneMinAvgRange.add(6,8.2*cyclistWeightKg);
        oneMinAvgRange.add(7,8.11*cyclistWeightKg);

        return oneMinAvgRange;
    }

    /* 6.05 	5.96	5.87	5.78	5.68	5.59	5.5 	5.41*/
    public ArrayList<Double> getFiveMinAvgRange(Double cyclistWeightKg){
        fiveMinAvgRange.add(0,6.05*cyclistWeightKg);
        fiveMinAvgRange.add(1,5.96*cyclistWeightKg);
        fiveMinAvgRange.add(2,5.87*cyclistWeightKg);
        fiveMinAvgRange.add(3,5.78*cyclistWeightKg);
        fiveMinAvgRange.add(4,5.68*cyclistWeightKg);
        fiveMinAvgRange.add(5,5.59*cyclistWeightKg);
        fiveMinAvgRange.add(6,5.5*cyclistWeightKg);
        fiveMinAvgRange.add(7,5.41*cyclistWeightKg);

        return fiveMinAvgRange;
    }

    /* 5.2	5.12	5.03	4.95	4.87	4.79	4.7	    4.62 */
    public ArrayList<Double> getFtAvgRange(Double cyclistWeightKg){
        ftAvgRange.add(0,5.2*cyclistWeightKg);
        ftAvgRange.add(1,5.12*cyclistWeightKg);
        ftAvgRange.add(2,5.03*cyclistWeightKg);
        ftAvgRange.add(3,4.95*cyclistWeightKg);
        ftAvgRange.add(4,4.87*cyclistWeightKg);
        ftAvgRange.add(5,4.79*cyclistWeightKg);
        ftAvgRange.add(6,4.7*cyclistWeightKg);
        ftAvgRange.add(7,4.62*cyclistWeightKg);

        return ftAvgRange;
    }

}
