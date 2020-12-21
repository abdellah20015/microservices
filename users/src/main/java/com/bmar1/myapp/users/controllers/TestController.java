package com.bmar1.myapp.users.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @GetMapping(path = "/message")
    @ResponseStatus(HttpStatus.OK)
    public String testRoute() {
        return "OK";
    }
}
