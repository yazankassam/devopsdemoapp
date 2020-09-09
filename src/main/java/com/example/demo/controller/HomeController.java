package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class HomeController {

    @Autowired
    Environment env;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String api(){
        return "Hello from DevOps Demo on port:" + env.getProperty("server.port");
    }
}
