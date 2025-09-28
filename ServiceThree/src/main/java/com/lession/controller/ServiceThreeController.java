package com.lession.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class ServiceThreeController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/serviceThreeToOne")
    public JSONObject serviceThreeToOne() {
        String responseFromServiceOne = restTemplate.getForObject("http://127.0.0.1:8001/serviceOne", String.class);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","service three call service one successfully");
        jsonObject.put("data",responseFromServiceOne);
        jsonObject.put("code",200);
        return jsonObject;
    }

    @GetMapping("/serviceThreeToTwo")
    public JSONObject serviceThreeToTwo() {
        String responseFromServiceOne = restTemplate.getForObject("http://127.0.0.1:8002/serviceTwo", String.class);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","service three call service Two successfully");
        jsonObject.put("data",responseFromServiceOne);
        jsonObject.put("code",200);
        return jsonObject;
    }
}
