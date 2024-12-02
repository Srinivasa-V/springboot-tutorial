package com.srinivasa.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
