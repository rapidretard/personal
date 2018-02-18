package com.shiveenpandita.personal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        return "index";
    }

    @GetMapping("/home")
    public String home(Map<String, Object> model) {
        return "home";
    }


    @GetMapping("/about-me")
    public String mePage() {
        return "about-me";
    }
}
