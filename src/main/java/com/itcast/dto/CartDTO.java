package com.itcast.dto;

import lombok.Data;

/**
 * @Author: superman
 * @Date: 2020/2/22 13:57
 * @Version 1.0
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}