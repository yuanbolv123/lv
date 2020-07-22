package com.yeexun.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * goods_type
 * @author 
 */
@Data   //此注解省略的get  set  toString
public class GoodsType implements Serializable {
    private Integer goodsTypeId;

    private Integer parentTypeId;

    private String typeName;

    private Integer sort;

    private String iconClass;

    private static final long serialVersionUID = 1L;


}