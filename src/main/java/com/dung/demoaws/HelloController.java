package com.dung.demoaws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private StudentRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "hello world from ec2";
    }

    @GetMapping("/students")
    public List getAll() {
        return repository.findAll();
    }

    @PostMapping("/students")
    public Student create(@RequestBody Student student) {
        return repository.save(student);
    }
}
