package com.bmar1.myapp.frontendserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping(path = "/callback")
    public String testRoute(HttpServletRequest request) {
        return "index";
    }
}
