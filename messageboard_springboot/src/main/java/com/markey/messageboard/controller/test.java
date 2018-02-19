package com.markey.messageboard.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class test {

    @RequestMapping("/")  
    String home() {  
        return "Hello World！世界你好！O(∩_∩)O哈哈~！！！";  
    } 
}
