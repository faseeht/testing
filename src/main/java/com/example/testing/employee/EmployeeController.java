package com.example.testing.employee;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveOrUpdate")
    public ResponseEntity<EmployeeBean> saveOrUpdate(@RequestBody EmployeeBean employeeBean){
        log.info("Employee Saving");
        return ResponseEntity.ok(employeeService.saveOrUpdate(employeeBean));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<EmployeeBean>> findAll(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<EmployeeBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

}
