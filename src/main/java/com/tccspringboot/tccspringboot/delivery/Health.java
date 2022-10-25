package com.tccspringboot.tccspringboot.delivery;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @GetMapping("/")
    public String health() {

        return new Date().toString();
    }
}