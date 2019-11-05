package com.zg.controller;

import com.zg.domain.Account;
import com.zg.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("Controller表现层：查询所有账户...");
        List<Account> list = accountService.findAll();
        return "list";   //在视图解析器中配置了前缀后缀
    }

}
