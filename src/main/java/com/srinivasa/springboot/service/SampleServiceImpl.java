package com.srinivasa.springboot.service;

import com.srinivasa.springboot.Entity.SampleEntity;
import com.srinivasa.springboot.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    @Override
    public SampleEntity addStudent(SampleEntity sampleEntity) {
        return sampleRepository.save(sampleEntity);
    }
}
