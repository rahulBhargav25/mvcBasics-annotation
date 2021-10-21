package com.example.webmvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class SmthWrongInThisController {

    @GetMapping("/does-it-work")
    public String itDoesNotWork() {
        throw new IllegalStateException("No It Does Not");

    }

    @GetMapping("/does-it-work-in-general")
    public String itDoesNotWorkInGeneral() {
        throw new RuntimeException("No It does not");
    }
}
