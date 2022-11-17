package com.example.testing.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> generalExceptionHandler(Exception ex) {
        return ResponseEntity.ok("Internal Server Error: "+ex.getMessage());
    }
}
