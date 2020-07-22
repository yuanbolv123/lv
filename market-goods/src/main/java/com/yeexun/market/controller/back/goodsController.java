package com.yeexun.market.controller.back;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/back/goods/")
public class goodsController {


    @RequestMapping("addPre")
    String addPre(){
        return "pages/back/goods/goods-addPre";
    }
}
