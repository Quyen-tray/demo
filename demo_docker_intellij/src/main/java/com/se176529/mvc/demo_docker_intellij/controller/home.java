package com.se176529.mvc.demo_docker_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {
    @GetMapping("/")
    public String index(Model model) {
        return "testhome";
    }
}
