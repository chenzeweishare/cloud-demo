package com.regent.rbp.storage.service;

/**
 * @author czw
 * @date 2020/9/5 17:17
 */
public interface StorageService {

    void decrStorage(String commodityCode, Integer count);
}
