package com.lession.feignclient;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-service-three")
public interface ServiceThreeFeignClient {
    @GetMapping("/serviceThreeToOne")
    JSONObject serviceThreeToOne();
    @GetMapping("/serviceThreeToTwo")
    JSONObject serviceThreeToTwo();
}
