package com.itcast.utils;

import com.itcast.enums.CodeEnum;

/**
 * @Author: superman
 * @Date: 2020/2/22 13:11
 * @Version 1.0
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}