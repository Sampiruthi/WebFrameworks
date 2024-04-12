package com.example.qns1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qns1.config.AppConfig;

@RestController
public class ApiController {
    @Autowired
    AppConfig af;
    @GetMapping("/infor")
    public String getmethod()
    {
        return ("App Name: "+af.getAppName()+", Version: "+af.getAppVersion());
    }
    
}
