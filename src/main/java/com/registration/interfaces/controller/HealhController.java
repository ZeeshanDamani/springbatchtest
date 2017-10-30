package com.registration.interfaces.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Zeeshan Damani
 */
@RestController
public class HealhController {

    @RequestMapping(value = "/health" , method = GET)
    public String health(){

        return "Hello , I am good  :) !";
    }
}
