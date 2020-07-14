package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @RequestMapping("/get")
    public String getStr(){
        return "Hello docker!";
    }
}
