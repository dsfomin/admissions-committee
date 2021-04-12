package com.epam.admissions.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }
}
