package com.yeexun.market.controller;

import com.yeexun.market.dao.UserDao;
import com.yeexun.market.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class indexController {

    @Resource
    UserDao userDao;

    @RequestMapping("/")

    //@ResponseBody  如果有次注解，页面直接返回index
    String index(){
       // User user=userDao.selectByPrimaryKey(1);
        return "index";
    }
}
