package com.cyzicus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping(value="/")
    public String getHello() {
        return "hello";
    }
}
