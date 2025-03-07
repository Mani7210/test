package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Entity.Authentication;
import com.example.test.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, String>{


	

}
