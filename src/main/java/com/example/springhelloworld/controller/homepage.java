package com.example.springhelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homepage {

    @GetMapping
    public String getHomePage(){
        return "Hello World From Java";
    }
}
