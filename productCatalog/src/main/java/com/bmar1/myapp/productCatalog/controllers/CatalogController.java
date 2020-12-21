package com.bmar1.myapp.productCatalog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/somecategory")
public class CatalogController {

    @ResponseBody
    @GetMapping(path = "/somesubcategory")
    @ResponseStatus(HttpStatus.OK)
    public String testRoute() {
        return "Products catalog is working !";
    }
}
