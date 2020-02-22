package com.itcast.exception;

import com.itcast.enums.ResultEnum;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:39
 * @Version 1.0
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();

    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
