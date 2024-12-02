package com.srinivasa.springboot.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    private String studentName;
    private String studentAddress;
    private String studentMajor;
}
