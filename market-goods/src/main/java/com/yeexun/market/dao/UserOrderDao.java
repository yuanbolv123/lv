package com.yeexun.market.dao;

import com.yeexun.market.pojo.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderDao {
    int insert(UserOrder record);

    int insertSelective(UserOrder record);
}