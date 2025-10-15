package com.gabriel.demo;

// Importa as classes necessárias do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Essa anotação ativa o auto-configuração do Spring Boot e marca a classe como ponto de entrada
@SpringBootApplication
public class DemoApplication {

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
