package com.yeexun.market.controller.pages.front;


import com.yeexun.market.pojo.entity.User;
import com.yeexun.market.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/pages/front")
public class LoginController {
    @Resource
    UserService userService;

    /**
     * 登录页面跳转
     *
     * @return
     */

    @RequestMapping("loginPage")
    String loginPage() {
        return "pages/front/login/loginPage";
    }

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("login")
    //String login(String phone,String passWord){//phone必须和前端的name值一致
    String login(User user, Model model) { //用对象去接收，只要对象中含参数,对象的属性值必须和前端的name值一致
        System.out.println(user.getPhone()+" _______________________________________ "+user.getPassword());


        if ("".equals(user.getPhone()) || user.getPhone() == null) {//电话参数都没有，就不用查询了，直接登录失败

            model.addAttribute("errorMsg", "请输入手机号登录！");
            return "pages/front/login/loginPage";//继续登录
        }
        boolean loginResult = userService.login(user);
        if (loginResult) {
            return "pages/back/index";
        }
        model.addAttribute("errorMsg", "登录失败，登录手机或登录密码错误");
        return "pages/front/login/loginPage";
    }
}
