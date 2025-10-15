package com.gabriel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador simples que responde à rota /hello
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, Gabriel! Essa é uma resposta real da aplicação.";
    }
}
