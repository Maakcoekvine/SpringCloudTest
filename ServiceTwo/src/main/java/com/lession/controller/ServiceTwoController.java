package com.lession.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceTwoController {

    @GetMapping("/serviceTwo")
    public JSONObject serviceTwo() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", "Service Tow request success ");
        jsonObject.put("code", 200);
        return jsonObject;
    }
}
