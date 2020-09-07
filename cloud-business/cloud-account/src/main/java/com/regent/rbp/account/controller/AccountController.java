package com.regent.rbp.account.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.regent.rbp.account.dao.AccountDao;
import com.regent.rbp.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* account
* @author czw
* @date 2020/09/05
*/
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private Registration registration;

    /**
    * [新增]
    * @author czw
    * @date 2020/09/05
    **/
    @RequestMapping("/list")
    public void list(){
        System.err.println(registration.getHost() + ":" + registration.getPort());
        System.out.println(accountDao.selectList(new QueryWrapper<>()));
    }

    @PostMapping("/decrMoney")
    public void decrMoney(@RequestParam("userId") String userId, @RequestParam("money") Integer money){
        //负载均衡打印
        System.err.println(registration.getHost() + ":" + registration.getPort());
        accountService.decrMoney(userId, money);
    }


}