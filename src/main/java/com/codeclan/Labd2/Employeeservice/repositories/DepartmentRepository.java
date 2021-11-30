package com.codeclan.Labd2.Employeeservice.repositories;

import com.codeclan.Labd2.Employeeservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
