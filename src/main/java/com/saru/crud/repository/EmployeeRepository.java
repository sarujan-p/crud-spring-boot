package com.saru.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saru.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

