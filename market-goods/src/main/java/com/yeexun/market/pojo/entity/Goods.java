package com.yeexun.market.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * goods
 * @author 
 */
@Data
public class Goods implements Serializable {
    private Integer goodsId;

    private String title;

    private String img;

    private Integer goodsTypeId;

    /**
     * 原价
     */
    private Double oldPrice;

    /**
     * 是否在售
     */
    private String onSala;

    private String detaid;

    private Integer count;

    private String merchantName;

    private Double price;

    private Integer evaluationCount;

    private static final long serialVersionUID = 1L;
}