package com.example.EmployeeManagementSystem.exception;

import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeReponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeeNotFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeeNotFoundException enfe)
    {
        return new ResponseEntity<String>(enfe.getLocalizedMessage(), HttpStatus.NOT_FOUND);
    }

}


