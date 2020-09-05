package com.regent.rbp.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author czw
 * @date 2020/9/5 17:43
 */
@FeignClient(name = "storage")
public interface StorageFeign {

    @RequestMapping(value = "/storage/decrStorage", method = RequestMethod.POST)
    void decrStorage(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}
