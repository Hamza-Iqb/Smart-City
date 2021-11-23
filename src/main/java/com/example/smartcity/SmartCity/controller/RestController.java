package com.example.smartcity.SmartCity.controller;

import com.example.smartcity.SmartCity.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.smartcity.SmartCity.services.RegistrationService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final RegistrationService registrationService;

    @Autowired
    public RestController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("registration/getAllRegistered")
    public ResponseEntity<List<Registration>> getAllRegistered(){
        return new ResponseEntity<List<Registration>>(registrationService.getAllRegistered(), HttpStatus.OK);
    }

    @GetMapping("registration/getRegisteredId/{username}")
    public ResponseEntity<Registration> getRegisteredId(@PathVariable("username") String username){
        return new ResponseEntity<Registration>(registrationService.getRegisteredId(username), HttpStatus.OK);
    }
}
