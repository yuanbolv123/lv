package com.yeexun.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * order_info
 * @author 
 */
@Data   //此注解省略的get  set  toString
public class OrderInfo implements Serializable {
    private Integer orderInfoId;

    private String orderId;

    private Integer originGoodId;

    private Double price;

    private Integer count;

    private String img;

    private Long oldPrice;

    private static final long serialVersionUID = 1L;


}