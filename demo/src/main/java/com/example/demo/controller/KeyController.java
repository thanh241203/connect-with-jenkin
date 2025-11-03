package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

    @GetMapping()
    public String sayHello2() {
        return  "Hello, im here re";
    }

    @GetMapping("/get-all")
    public String sayHello1() {
        return  "dang o day";
    }
}
