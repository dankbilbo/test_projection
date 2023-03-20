package com.example.demo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @PutMapping
    public void test(@RequestBody TestRequest testRequest){
        System.out.println(testRequest.isEnabled());
    }
}
