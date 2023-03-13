package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String string :
                args) {
            if(!StringUtils.isPositiveNumber(string)) {
                return false;
            }
        }
        return true;
    }
}