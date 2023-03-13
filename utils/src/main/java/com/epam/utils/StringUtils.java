package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isNumber(str)) {
            return false;
        }
        return Long.parseLong(str) > 0;
    }

}
