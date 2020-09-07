package com.regent.rbp.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.regent.rbp.order.bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
*  order
* @author 大狼狗 2020-09-05
*/
public interface OrderDao extends BaseMapper<Order> {

    @Insert("insert into `order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (${order.id}, ${order.userId}, ${order.commodityCode}, ${order.count}, ${order.money})")
    void save(@Param("order") Order order);
}