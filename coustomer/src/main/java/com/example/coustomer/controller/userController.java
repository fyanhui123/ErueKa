package com.example.coustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.RequestWrapper;
@RestController
public class userController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/buy")
    public String toString( String username ) {
      String a=  restTemplate.getForObject("http://EUREKA-CLIENT/client",String.class);
        return username+"买一张电影票"+a;
    }
}
