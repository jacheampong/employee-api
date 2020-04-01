package com.ja.dev.legostore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ja.dev.legostore.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
