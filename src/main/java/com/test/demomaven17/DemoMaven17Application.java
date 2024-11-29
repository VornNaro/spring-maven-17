package com.test.demomaven17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMaven17Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoMaven17Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello maven 17";
    }

}
