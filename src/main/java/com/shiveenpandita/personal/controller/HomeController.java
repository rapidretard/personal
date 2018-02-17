package com.shiveenpandita.personal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    private String getIndex() {
        log.info("Sending home page");
        return "index";
    }
}
