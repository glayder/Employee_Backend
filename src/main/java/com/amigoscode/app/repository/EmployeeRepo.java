package com.amigoscode.app.repository;

import java.util.Optional;

import com.amigoscode.app.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

  void deleteEmployeeById(Long id);

  Optional<Employee> findEmployeeById(Long id);

}
