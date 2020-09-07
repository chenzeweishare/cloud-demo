package com.regent.rbp.storage.bean;

import java.io.Serializable;

import lombok.Data;

/**
*  storage
* @author czw 2020-09-05
*/
@Data
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * id
    */
    private Integer id;

    /**
    * 商品code
    */
    private String commodityCode;

    /**
    * 商品总数量
    */
    private Integer count;

}
