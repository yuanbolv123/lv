package com.yeexun.market.service.impl;

import com.yeexun.market.dao.UserDao;
import com.yeexun.market.pojo.entity.User;
import com.yeexun.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service //交给spring IOC自动装配
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public boolean login(User user) {
        User dbUser = userDao.SelectByPhone(user.getPhone());
        if (dbUser == null) {
            return false;
        } else {
            if(user.getPassword()==null){
                return false;
            }
            if (user.getPassword().equals(dbUser.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
