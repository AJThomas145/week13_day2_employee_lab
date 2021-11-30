package com.codeclan.Labd2.Employeeservice.repositories;

import com.codeclan.Labd2.Employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Long> {
}
