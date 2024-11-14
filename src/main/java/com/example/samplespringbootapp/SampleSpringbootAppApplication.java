package com.example.samplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleSpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringbootAppApplication.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/")
        public String hello() {
            return "Hello, Spring Boot!";
        }
    }
}
