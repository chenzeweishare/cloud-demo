package com.regent.rbp.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.regent.rbp.account.bean.Account;
import com.regent.rbp.account.dao.AccountDao;
import com.regent.rbp.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author czw
 * @date 2020/9/5 17:03
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void decrMoney(String userId, Integer money) {
        Account account = accountDao.selectOne(new QueryWrapper<Account>().eq("user_id", userId));
        account.setMoney(account.getMoney() - money);
        accountDao.updateById(account);
    }
}
