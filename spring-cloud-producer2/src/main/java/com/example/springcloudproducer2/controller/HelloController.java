package com.example.springcloudproducer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michangtao in 2018/7/9 9:18
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(String name){
        return "hello "+name+",this is producer2 send first message";
    }
}
