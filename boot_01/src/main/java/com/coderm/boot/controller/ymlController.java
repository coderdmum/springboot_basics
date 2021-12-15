package com.coderm.boot.controller;


import com.coderm.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ymlController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
