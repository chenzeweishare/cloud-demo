package com.regent.rbp.account.service;

/**
* account
* @author czw
* @date 2020/09/05
*/
public interface AccountService {

    void decrMoney(String userId, Integer money);
}