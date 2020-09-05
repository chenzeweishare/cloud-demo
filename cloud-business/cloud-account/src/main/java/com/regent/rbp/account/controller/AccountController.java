package com.regent.rbp.account.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.regent.rbp.account.dao.AccountDao;
import com.regent.rbp.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* account
* @author 大狼狗
* @date 2020/09/05
*/
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountDao accountDao;

    /**
    * [新增]
    * @author 大狼狗
    * @date 2020/09/05
    **/
    @RequestMapping("/list")
    public void list(){
        System.out.println(accountDao.selectList(new QueryWrapper<>()));
    }

    @PostMapping("/decrMoney")
    public void decrMoney(@RequestParam("userId") String userId, @RequestParam("money") Integer money){
        accountService.decrMoney(userId, money);
    }


}