package com.example.test.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.Employee;
import com.example.test.Service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;


@Validated
@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private  EmployeeService employeeService;

    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee, HttpServletRequest httpRequest) {
        logger.info("Creating new employee: {}", employee.getName());

        Employee savedEmployee = employeeService.saveEmployee(employee);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }
   
    @GetMapping
    public ResponseEntity<Page<Employee>> getEmployees(
            @RequestParam(defaultValue = "0") int page, 
            @RequestParam(defaultValue = "10") int size, 
            @RequestParam(defaultValue = "name") String sortBy) {

        logger.info("Fetching employee list with pagination - Page: {}, Size: {}, SortBy: {}", page, size, sortBy);

        // Create Pageable instance
        Pageable pageable = PageRequest.of(page, size);

        // Get the paginated list of employees
        Page<Employee> employees = employeeService.getEmployees(pageable);

        return ResponseEntity.ok(employees);
    }

}
