package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;


    @GetMapping(value = "/")
    public String welcome()
    {
        return "<h1 style='text-align:center'>Welcome To AWS Code Pipeline</h1>";
    }


    @PostMapping(value = "/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PostMapping(value = "/allEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
    }


    @GetMapping(value = "/{eid}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer eid)
    {
        return new ResponseEntity<Employee>(employeeService.getEmployee(eid), HttpStatus.OK);
    }


}
