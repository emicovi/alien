package com.space.scanner.alien.controller;

import com.space.scanner.alien.bean.Planet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/greeter")
    public String index() {
        return "Greetings from World!";
    }
    @Autowired
    Planet planet;

    @GetMapping("/planet")
    public String planet() {
        return planet.getGreetings()+"!";

    }
}
