package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @RequestMapping("/get")
    public String getStr(){
        return "Hi dafei "+new Date();
    }
}
