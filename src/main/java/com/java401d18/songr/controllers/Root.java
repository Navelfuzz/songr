package com.java401d18.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Root {
    @GetMapping("/")
    public String getRoot(){
        return "splash.html";
    }
}
