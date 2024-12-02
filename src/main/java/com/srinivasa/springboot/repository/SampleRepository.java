package com.srinivasa.springboot.repository;

import com.srinivasa.springboot.Entity.SampleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CrudRepository<SampleEntity, Long> {
}
