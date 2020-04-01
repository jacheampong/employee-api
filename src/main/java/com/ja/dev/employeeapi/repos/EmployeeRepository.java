package com.ja.dev.employeeapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ja.dev.employeeapi.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
