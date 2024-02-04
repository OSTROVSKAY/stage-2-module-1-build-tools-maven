package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        for(String str: args){
            if(str == null) return false;
            try {
                Float.parseFloat(str);
            } catch (Exception e) {
                return false;
            }
            if(Float.parseFloat(str) <= 0) return false;
        }
        return true;
       //magic happens here
    }
}