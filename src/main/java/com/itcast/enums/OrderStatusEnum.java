package com.itcast.enums;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.Getter;

/**
 * @Author: superman
 * @Date: 2020/2/22 11:34
 * @Version 1.0
 */
@Getter
public enum  OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
            ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
