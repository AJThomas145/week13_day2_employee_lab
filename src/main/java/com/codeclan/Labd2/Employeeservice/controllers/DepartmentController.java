package com.codeclan.Labd2.Employeeservice.controllers;

import com.codeclan.Labd2.Employeeservice.models.Department;
import com.codeclan.Labd2.Employeeservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    
    @Autowired
    DepartmentRepository departmentRepository;
    
    @GetMapping(value="/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    
    @GetMapping(value="/departments/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}