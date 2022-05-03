package br.com.reges.backend.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá mundo!";
    }
    
}

