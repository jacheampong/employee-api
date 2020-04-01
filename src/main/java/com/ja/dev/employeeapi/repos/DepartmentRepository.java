package com.ja.dev.employeeapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ja.dev.employeeapi.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
