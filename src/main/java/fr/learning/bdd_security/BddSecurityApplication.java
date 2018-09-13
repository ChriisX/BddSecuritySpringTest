package fr.learning.bdd_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSpringConfigured
public class BddSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BddSecurityApplication.class, args);
    }
}
