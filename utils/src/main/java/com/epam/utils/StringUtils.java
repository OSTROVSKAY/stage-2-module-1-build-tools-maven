package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if (str == null) return false;
        try {
            Float.parseFloat(str);
        } catch (Exception e) {
            return false;
        }
        return Float.parseFloat(str) > 0;
        //code!
    }
}
