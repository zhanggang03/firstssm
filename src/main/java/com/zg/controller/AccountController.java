package com.zg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("Controller表现层：查询所有账户...");
        return "list";   //在视图解析器中配置了前缀后缀
    }

}
