package com.vanhi.appointger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointgerController {
    @RequestMapping
    public String helloAppointger(){
        return  "Hello to the Appointment Manager from Spring boot";
    }
}
