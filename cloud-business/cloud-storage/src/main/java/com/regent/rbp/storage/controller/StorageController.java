package com.regent.rbp.storage.controller;

import com.regent.rbp.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* storage
* @author czw 2020-09-05
*/
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/decrStorage")
    public void decrStorage(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count){
        storageService.decrStorage(commodityCode, count);
    }

}