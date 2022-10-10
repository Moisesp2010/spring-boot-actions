package com.springactions.springbootactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootActionsApplication {

    @GetMapping("/welcome")
    public String home() {
        return "Bem vindo ao Spring Boot Actions e Docker funiona agora pelo amor de Deus ok";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActionsApplication.class, args);
    }

}
