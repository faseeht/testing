package com.example.testing.employee;

import java.util.List;

public interface EmployeeService {

    EmployeeBean saveOrUpdate(EmployeeBean employeeBean);
    List<EmployeeBean> getAllEmployees();
    EmployeeBean getEmployeeById(Integer id);
}
