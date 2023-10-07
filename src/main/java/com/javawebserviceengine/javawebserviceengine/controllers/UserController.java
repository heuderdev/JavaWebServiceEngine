package com.javawebserviceengine.javawebserviceengine.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String index() throws UnknownHostException {
       return "API";
    }

}
