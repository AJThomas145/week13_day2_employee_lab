package com.codeclan.Labd2.Employeeservice;

import com.codeclan.Labd2.Employeeservice.models.Department;
import com.codeclan.Labd2.Employeeservice.models.Employee;
import com.codeclan.Labd2.Employeeservice.models.Project;
import com.codeclan.Labd2.Employeeservice.repositories.DepartmentRepository;
import com.codeclan.Labd2.Employeeservice.repositories.EmployeeRepository;
import com.codeclan.Labd2.Employeeservice.repositories.ProjectsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectsRepository projectsRepository;

	@Test
	public void createEmployee(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);
		Employee employee = new Employee("Andrew", "Thomas", 12345, department);
		Employee employee2 = new Employee("Drew", "Crossan", 4321, department);
		employeeRepository.save(employee);
		employeeRepository.save(employee2);

		Project project1 = new Project("Java", 14);
		Project project2 = new Project("JavaScript", 30);
		projectsRepository.save(project1);
		projectsRepository.save(project2);

		project1.addEmployee((employee));
		project1.addEmployee((employee2));
		projectsRepository.save(project1);
		project2.addEmployee((employee2));
		projectsRepository.save(project2);

	}

}
