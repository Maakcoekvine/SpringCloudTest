package com.lession.feignclient;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-service-one")
public interface ServiceOneFeignClient {
    @GetMapping("/serviceOne")
    JSONObject serviceOne();
}
