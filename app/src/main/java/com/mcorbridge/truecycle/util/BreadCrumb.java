package com.mcorbridge.truecycle.util;

import java.util.ArrayList;

/**
 * Created by Mike on 12/16/2014.
 * copyright Michael D. Corbridge
 */
public class BreadCrumb {

    private final static String KILOGRAMS = "kilograms";
    private final static String POUNDS = "pounds";

    // parse the wattage value to show only the whole number
    public static ArrayList parseDouble(ArrayList arrayList){
        ArrayList<String> arString = new ArrayList<String>();
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i).toString();
            String[] parts = s.split("\\.");
            arString.add(i,parts[0]);
        }
        return arString;
    }

    // set header text in activity_show_effort
    public static String getEffortString(int effort){
        switch(effort)
        {
            case 0:
                return "5 second max";

            case 1:
                return "1 minute avg.";

            case 2:
                return "5 minute avg.";

            case 3:
                return "func. thresh.";
        }
        return "";
    }

    public static String getGenderString(int gender){
        return (gender == 0) ? "male" : "female";
    }

    public static String getUnitAbbrev(String unit){
        return (unit.equals(KILOGRAMS)) ? "kg" : "lb";
    }
}
