package com.example.hellojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Jenkins!";
    }
}
