package com.srinivasa.springboot.controller;

import com.srinivasa.springboot.Entity.SampleEntity;
import com.srinivasa.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/sample")
    public String printSample(){
        return "Hello Srinivasa";
    }

    @PostMapping("/enterStudent")
    public SampleEntity addStudent(@RequestBody SampleEntity sampleEntity){
        return sampleService.addStudent(sampleEntity);
    }
}
