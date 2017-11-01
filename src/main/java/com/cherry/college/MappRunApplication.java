package com.cherry.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cherry.college.controller")
public class MappRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(MappRunApplication.class, args);
    }
}
