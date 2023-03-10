package com.example.eureka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServerController {

    @RequestMapping(value="/ping", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> pong(){
        final var api = "09/03/2023";
       return ResponseEntity.ok(api);
    }

}
