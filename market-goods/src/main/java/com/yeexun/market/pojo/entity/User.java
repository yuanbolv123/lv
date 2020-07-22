package com.yeexun.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * user
 * @author 
 */
@Data   //此注解省略的get  set  toString
public class User implements Serializable {
    private Integer userId;

    private String nickName;

    private String realName;

    private String phone;

    private String password;

    private Date lastLoginTime;

    private String lastLoginIp;

    private static final long serialVersionUID = 1L;


}