package com.example.basicrepo.controller;


import com.example.basicrepo.Repo.EmployeeRepo;
import com.example.basicrepo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private EmployeeRepo employeeRepo;


    @GetMapping
    public List<Employee> getAllDetails()
    {
        return null;
    }


}
