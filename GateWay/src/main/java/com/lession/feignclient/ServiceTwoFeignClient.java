package com.lession.feignclient;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-service-two")
public interface ServiceTwoFeignClient {
    @GetMapping("/serviceTwo")
    JSONObject serviceTwo();
}
