package com.itcast.dataobject;

import com.itcast.enums.OrderStatusEnum;
import com.itcast.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.domain.PageRequest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: superman
 * @Date: 2020/2/22 11:25
 * @Version 1.0
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /**订单id*/
    @Id
    private String orderId;

    /**买家名字*/
    private String  buyerName;

    /**买家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信openId*/
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单的状态*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;



}
