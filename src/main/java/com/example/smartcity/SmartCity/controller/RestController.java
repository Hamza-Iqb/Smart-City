package com.example.smartcity.SmartCity.controller;

import com.example.smartcity.SmartCity.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.smartcity.SmartCity.services.RegistrationService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("registration")
public class RestController {

    private final RegistrationService registrationService;

    @Autowired
    public RestController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("getAllRegistered")
    public ResponseEntity<List<Registration>> getAllRegistered(){
        return new ResponseEntity<List<Registration>>(registrationService.getAllRegistered(), HttpStatus.OK);
    }

    @GetMapping("getRegisteredId/{username}")
    public ResponseEntity<Registration> getRegisteredId(@PathVariable("username") String username){
        return new ResponseEntity<Registration>(registrationService.getRegisteredId(username), HttpStatus.OK);
    }

    @PostMapping("addRegistration")
    public ResponseEntity<Registration> addRegistration(@RequestBody Registration registration){
        Registration result = registrationService.addRegistration(registration);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @DeleteMapping("deleteRegistration/{username}")
    public ResponseEntity<String> deleteRegistration(@PathVariable ("username") String username){
        registrationService.deleteRegistration(username);
        return new ResponseEntity<String>(String.format("Successfully deleted employee with Username: '%s'", username), HttpStatus.OK);
    }

}
