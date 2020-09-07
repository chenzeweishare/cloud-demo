package com.regent.rbp.storage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.regent.rbp.storage.bean.Storage;
import com.regent.rbp.storage.dao.StorageDao;
import com.regent.rbp.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author czw
 * @date 2020/9/5 17:17
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @LcnTransaction
    @Transactional
    @Override
    public void decrStorage(String commodityCode, Integer count) {
        Storage storage = storageDao.selectOne(new QueryWrapper<Storage>().eq("commodity_code", commodityCode));
        storage.setCount(storage.getCount() - count);
        storageDao.updateById(storage);
    }
}
