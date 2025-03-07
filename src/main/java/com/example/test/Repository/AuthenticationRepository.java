package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Entity.Employee;

public interface AuthenticationRepository extends JpaRepository<Employee, String> {

}
