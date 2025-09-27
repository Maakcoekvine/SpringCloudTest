package com.lession.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceOneController {

    @GetMapping("/serviceOne")
    public JSONObject serviceOne() {
        JSONObject  obj = new JSONObject();
        obj.put("msg", "Service One request success ");
        obj.put("code", 200);
        return obj;
    }
}
