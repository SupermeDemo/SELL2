package com.itcast.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: superman
 * @Date: 2020/2/21 23:21
 * @Version 1.0
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    /** 名字*/
    @JsonProperty("name")
    private String productName;

    /** 单价*/
    @JsonProperty("price")
    private BigDecimal productPrice;

    /** 描述*/
    @JsonProperty("description")
    private String productDescription;

    /** 小图. */
    @JsonProperty("icon")
    private String productIcon;

}
