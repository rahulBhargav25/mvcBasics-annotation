package com.example.webmvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class ThymleafController {
    @GetMapping("/view")
    public String WhatisCool() {
        return "thymeleaf-is-cool";
    }

    @GetMapping("/model")
    public String whatCanWePassToView(Model model) {
        model.addAttribute("attributekey","Anything We want to pass to the view");
        return "thymeleaf-is-cool";
    }
}
