package com.zone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = "/hello",produces = "application/json;charset=utf-8")
    @ResponseBody
    //响应JSON
    public String hello(){
        return "hello";
    }
}
