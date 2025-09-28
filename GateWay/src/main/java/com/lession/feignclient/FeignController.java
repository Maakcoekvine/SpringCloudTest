package com.lession.feignclient;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignCall")
public class FeignController {
    @Autowired
    private ServiceOneFeignClient serviceOneFeignClient;
    @Autowired
    private ServiceTwoFeignClient serviceTwoFeignClient;
    @Autowired
    private ServiceThreeFeignClient serviceThreeFeignClient;


    @GetMapping("/serviceOne")
    public JSONObject serviceOneService(){
        return serviceOneFeignClient.serviceOne();
    }

    @GetMapping("/serviceTwo")
    public JSONObject serviceTwoService(){
        return serviceTwoFeignClient.serviceTwo();
    }

    @GetMapping("/serviceThreeToOne")
    public JSONObject serviceThreeToOneService(){
        return serviceThreeFeignClient.serviceThreeToOne();
    }

    @GetMapping("/serviceThreeToTwo")
    public JSONObject serviceThreeToTwoService(){
        return serviceThreeFeignClient.serviceThreeToTwo();
    }
}
