package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    @GetMapping("/update")
    public String update() {
        DemoApplication.hazelcastInstance.getMap("data").put(new Date().getTime(), "das" + new Date().getTime());
        return "ok";
    }

    @GetMapping("/get")
    public String get() {
        return String.valueOf(DemoApplication.hazelcastInstance.getMap("data").size());
    }
}
