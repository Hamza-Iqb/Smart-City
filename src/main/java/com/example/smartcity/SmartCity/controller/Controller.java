package com.example.smartcity.SmartCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    public final RestController restController;

    @Autowired
    public Controller(RestController restController) {
        this.restController = restController;
    }


    @RequestMapping("")
    public String signInPage(){
        return "signin";
    }

    @PostMapping("signup")
    public String signup(){
        return "signup";
    }
}
