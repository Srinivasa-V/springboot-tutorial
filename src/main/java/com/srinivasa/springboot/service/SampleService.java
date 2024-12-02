package com.srinivasa.springboot.service;

import com.srinivasa.springboot.Entity.SampleEntity;

import java.util.List;

public interface SampleService {
    public List<SampleEntity> enterAllStudent(List<SampleEntity> sampleEntityList);

    public List<SampleEntity> getAllStudent();

    public SampleEntity getStudentById(Long id);
}
