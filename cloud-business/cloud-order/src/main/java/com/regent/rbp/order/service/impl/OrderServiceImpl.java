package com.regent.rbp.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.regent.rbp.order.bean.Order;
import com.regent.rbp.order.dao.OrderDao;
import com.regent.rbp.order.feign.AccountFeign;
import com.regent.rbp.order.feign.StorageFeign;
import com.regent.rbp.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author czw
 * @date 2020/9/5 17:18
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private AccountFeign accountFeign;

    @Autowired
    private StorageFeign storageFeign;

    /**
     * 1.创建订单
     * 2.扣库存
     * 3.扣钱
     * @param order
     */
    @LcnTransaction
    @Transactional
    @Override
    public void save(Order order) {
        storageFeign.decrStorage(order.getCommodityCode(), order.getCount());
        orderDao.save(order);
        accountFeign.decrMoney(order.getUserId(), order.getMoney());
        if (order.getId() % 2  == 0) {
            int i = 1 / 0;
        }
    }
}
