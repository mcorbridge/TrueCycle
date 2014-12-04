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

    DomesticProWattData(){

    }

    public void setCyclistWeightKg(double cyclistWeightKg){
        this.cyclistWeightKg = cyclistWeightKg;
    }

    public void getWattData(){
        getFiveSecMaxRange(cyclistWeightKg);
        getOneMinMaxRange(cyclistWeightKg);
        getFiveMinMaxRange(cyclistWeightKg);
        getFtMaxRange(cyclistWeightKg);
    }

    public Double convertPoundToKilo(Double pounds){
        return pounds * 0.453592;
    }

    /* 22.14    21.86    21.59   21.32  21.05   20.78    20.51  20.23 */
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
    /* 10.7	    10.58	10.47	10.35	10.24	10.12	10.01	9.89 */
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

    /* 6.88	    6.77	6.67	6.57	6.46	6.36	6.26	6.15 */
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
