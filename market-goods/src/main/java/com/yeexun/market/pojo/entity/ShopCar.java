package com.yeexun.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * shop_car
 * @author 
 */
@Data   //此注解省略的get  set  toString
public class ShopCar implements Serializable {
    private Integer shopCarId;

    private Integer userId;

    private Integer goodsId;

    private Integer count;

    private static final long serialVersionUID = 1L;


}