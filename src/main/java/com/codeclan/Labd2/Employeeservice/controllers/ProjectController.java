package com.codeclan.Labd2.Employeeservice.controllers;

import com.codeclan.Labd2.Employeeservice.models.Project;
import com.codeclan.Labd2.Employeeservice.repositories.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectsRepository projectsRepository;

    @GetMapping(value="/projects")
    public List<Project> getAllProjects(){
        return projectsRepository.findAll();
    }

    @GetMapping(value="/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectsRepository.findById(id);
    }

}
