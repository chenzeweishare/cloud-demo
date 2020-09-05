package com.regent.rbp.order.controller;

import com.regent.rbp.order.bean.Order;
import com.regent.rbp.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* order
* @author 大狼狗 2020-09-05
*/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
    * 新增或编辑
    */
    @PostMapping("/insert")
    public Object insert(Order order){
        orderService.insert(order);
        return null;
    }

}