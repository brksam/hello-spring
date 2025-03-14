package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/test")
    public String helloWorld(){
        return "Hello World!, tente usar o endpoint /estudos!";
    }
    
    @GetMapping("/estudos")
    public String estudos() {
        return "Seja bem-vindo à seção de estudos! Estou aprendendo e evoluindo obrigado por acomponhar essa jornada.";
    }
}
