package com.example.eurekaclient.controller;

import com.example.eurekaclient.service.ClientServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientContraller {
    @Autowired
    ClientServer clientServer;
    @GetMapping("/client")
    public String getClient() {
     return   clientServer.getMoveName();
    }
}
