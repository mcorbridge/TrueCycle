package com.mcorbridge.truecycle.data.vo;

/**
 * Created by Mike on 12/8/2014.
 */
public class Cyclist {

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String gender;

     // ----------------------------------------------

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double weight;

    // ----------------------------------------------

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String weightUnit;

    // ----------------------------------------------

    public String getWeightString() {
        return weightString;
    }

    public void setWeightString(String weightString) {
        this.weightString = weightString;
    }

    public String weightString;

    // ----------------------------------------------

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String category;

    // ----------------------------------------------

    public int getEffort() { return effort;}

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int effort;
}