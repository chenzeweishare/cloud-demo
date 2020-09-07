package com.regent.rbp.account.bean;

import java.io.Serializable;

import lombok.Data;

/**
*  account_tbl
* @author czw 2020-09-05
*/
@Data
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * id
    */
    private Integer id;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 总金额
    */
    private Integer money;

}