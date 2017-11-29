package com.Validator;

/**
 * Created by sindhud on 27/11/17.
 */
public class checkForAppropriateData {

    public final static int NO_OF_LINE = 6;
    public final static String delimitor = "|";

    public static boolean validateString(String line){

        int count =line.length()-line.replace("|","").length();
        return count==NO_OF_LINE?true:false;
    }
}
