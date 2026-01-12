package com.demo.springboot_ci_cd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
    	return "Hello Ajju - CI/CD PR Flow Demo by kubernates automatically";
    }
}