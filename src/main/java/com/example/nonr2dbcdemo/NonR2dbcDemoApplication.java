package com.example.nonr2dbcdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class NonR2dbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NonR2dbcDemoApplication.class, args);
    }

    @RestController
    @RequiredArgsConstructor
    class StudentController{
        private final StudentRepository repository;

        @GetMapping("/v1/students")
        public Iterable<Student> getStudents() {
            return repository.findAll();
        }
    }

}
