package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestSpringBoot {

    @RequestMapping("/findAll")
    public String findAll(){
        return "success";
    }
}
