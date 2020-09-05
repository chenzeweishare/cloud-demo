package com.regent.rbp.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author czw
 * @date 2020/9/5 17:26
 */
@FeignClient(name = "account")
public interface AccountFeign {

    @RequestMapping(value = "/account/decrMoney", method = RequestMethod.POST)
    void decrMoney(@RequestParam("userId") String userId, @RequestParam("money") Integer money);
}
