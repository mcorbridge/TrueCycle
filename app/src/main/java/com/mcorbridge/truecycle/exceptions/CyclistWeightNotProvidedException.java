package com.mcorbridge.truecycle.exceptions;

/**
 * Created by Mike on 12/8/2014.
 */
public class CyclistWeightNotProvidedException extends Exception {


    public CyclistWeightNotProvidedException() {
        super("A cyclist weight MUST be provided");
    }

}
