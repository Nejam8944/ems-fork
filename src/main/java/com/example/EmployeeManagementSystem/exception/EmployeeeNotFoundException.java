package com.example.EmployeeManagementSystem.exception;

import com.example.EmployeeManagementSystem.entity.Employee;

public class EmployeeeNotFoundException extends RuntimeException {

    public EmployeeeNotFoundException(){

    }
    public EmployeeeNotFoundException(String s) {
        super(s);
    }
}
