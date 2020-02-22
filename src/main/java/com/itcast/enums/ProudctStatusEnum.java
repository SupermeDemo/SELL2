package com.itcast.enums;

import lombok.Getter;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:11
 * @Version 1.0
 */
@Getter
public enum ProudctStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProudctStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
