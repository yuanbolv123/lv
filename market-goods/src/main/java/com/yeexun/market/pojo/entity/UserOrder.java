package com.yeexun.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * user_order
 * @author 
 */
@Data   //此注解省略的get  set  toString
public class UserOrder implements Serializable {
    private String orderId;

    /**
     * 总价
     */
    private Double allCost;

    private Date createTime;

    private Date payTime;

    private String receiverPhone;

    private String receiverName;

    private String receiverAddress;

    private String payType;

    private String status;

    /**
     * 实际金额
     */
    private Double actualPayment;

    /**
     * 总减免
     */
    private Double totalDeduction;

    private Integer userId;

    private static final long serialVersionUID = 1L;


}