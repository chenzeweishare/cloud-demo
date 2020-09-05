package com.regent.rbp.order.bean;

import java.io.Serializable;

import lombok.Data;

/**
*  order
* @author 大狼狗 2020-09-05
*/
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * id
    */
    private Integer id;

    /**
    * user_id
    */
    private String userId;

    /**
    * 商品code
    */
    private String commodityCode;

    /**
    * 购买数量
    */
    private Integer count;

    /**
    * 购买金额
    */
    private Integer money;

}