package com.zg.dao;

import com.zg.domain.Account;

import java.util.List;

public interface IAccountdao {
    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
