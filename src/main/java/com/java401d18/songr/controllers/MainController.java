package com.java401d18.songr.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/capitalize/{words}")
    public String capitalize(@PathVariable String words, Model model) {
        model.addAttribute("capitalizedWords", words.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/")
    public String splash() {
        return "splash";
    }
}