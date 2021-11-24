package com.example.smartcity.SmartCity.controller;

import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.enums.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

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

    @RequestMapping("signup")
    public String signup(){
        return "signup";
    }

    @RequestMapping("home")
    @ResponseBody
    public ModelAndView home(@RequestParam String firstName,
                             @RequestParam String lastName,
                             @RequestParam String email,
                             @RequestParam UserType userType,
                             @RequestParam String username,
                             @RequestParam String password,
                             @RequestParam String pswRepeat) throws IOException {

        ModelAndView mv = new ModelAndView("home");

        Registration registration = new Registration(firstName, lastName, email, username, password, userType);
        restController.addRegistration(registration);

        mv.addObject("test", "test");

        return mv;
    }
}
