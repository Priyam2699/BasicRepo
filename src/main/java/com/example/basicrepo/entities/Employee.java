package com.example.basicrepo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String fname;

    private String lname;

    private int age;



}
