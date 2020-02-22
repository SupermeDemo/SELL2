package com.itcast.VO;

import lombok.Data;

/**
 * @Author: superman
 * @Date: 2020/2/21 23:18
 * @Version 1.0
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
