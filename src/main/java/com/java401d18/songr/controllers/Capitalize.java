package com.java401d18.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class Capitalize {
    @GetMapping("/capitalize/{words}")
    public String capitalize(@PathVariable String words, Model model){
        String capitalizedWords = words.toUpperCase();
        model.addAttribute("capitalizedWords", capitalizedWords);
        return "capitalize";
    }

}
