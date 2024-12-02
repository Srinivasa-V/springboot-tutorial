package com.srinivasa.springboot.controller;

import com.srinivasa.springboot.Entity.SampleEntity;
import com.srinivasa.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;
    @GetMapping("/sample")
    public String printSample(){
        return "Hello Srinivasa";
    }

    @PostMapping("/enterAllStudent")
    public List<SampleEntity> enterAllStudent(@RequestBody List<SampleEntity> sampleEntityList){
        return sampleService.enterAllStudent(sampleEntityList);
    }

    @GetMapping("/getAllStudent")
    public List<SampleEntity> getAllStudent(){
        return sampleService.getAllStudent();
    }

    @GetMapping("/getStudent/id/{id}")
    public SampleEntity getStudentById(@PathVariable("id") Long id){
        return sampleService.getStudentById(id);
    }
}
