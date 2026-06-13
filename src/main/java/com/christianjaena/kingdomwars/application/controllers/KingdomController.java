package com.christianjaena.kingdomwars.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kingdoms")
public class KingdomController {

    @GetMapping
    public String test() {
        return "test";
    }
}
