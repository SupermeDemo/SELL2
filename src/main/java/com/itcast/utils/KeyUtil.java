package com.itcast.utils;

import java.util.Random;

/**
 * @Author: superman
 * @Date: 2020/2/22 11:50
 * @Version 1.0
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
