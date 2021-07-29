package com.afernanded.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afernanded.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
