package com.jwt.appjwt.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/datas")
    public String getData() {
        return "your data";
    }
}
