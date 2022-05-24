package com.example.basicrepo.controller;


import com.example.basicrepo.entities.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {





    @GetMapping
    public List<Employee> getAllDetails()
    {
        return null;
    }


    @GetMapping(path="/v1/{id}")
    public Employee getById(@PathVariable int id)
    {
        return null;
    }



}
