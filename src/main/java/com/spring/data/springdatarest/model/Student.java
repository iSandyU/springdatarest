package com.spring.data.springdatarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
    
    @Id
    @GeneratedValue
private int id ;

private String name;

private int age;

}