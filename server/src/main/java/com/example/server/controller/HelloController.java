package com.example.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value="/say")
    public String Hello(){
        return "Hello World2";
    }
}
