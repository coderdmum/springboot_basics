package com.coderm.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/01.jpg")
    public String hello() {
        return "aaaa";
    }
}
