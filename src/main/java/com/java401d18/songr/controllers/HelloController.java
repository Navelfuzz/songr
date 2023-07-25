package com.java401d18.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "hello";
    }

    @GetMapping("/")
    public String splash(){
        return "splash";
    }
}
