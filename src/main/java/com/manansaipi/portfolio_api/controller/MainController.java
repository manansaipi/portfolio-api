package com.manansaipi.portfolio_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired

    @GetMapping("/")
    public String index() {
        return "Hello :)";
    }

}
