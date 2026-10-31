package com.kiet.ecommerce_rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mycontroller {

        @GetMapping("/hello")
        public String hello() {
            return "Welcome to our e-commerce store!";
        }
    }

