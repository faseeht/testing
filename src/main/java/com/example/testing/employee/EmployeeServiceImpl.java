package com.example.testing.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeBean saveOrUpdate(EmployeeBean employeeBean) {
        if(employeeBean != null){
            EmployeeModel employeeModel = new EmployeeModel();
            if(employeeBean.getId() != null){
                employeeModel.setId(Integer.parseInt(employeeBean.getId()));
            }
            employeeModel.setName(employeeBean.getName());
            employeeModel.setEmail(employeeBean.getEmail());
            employeeModel.setMobileNumber(employeeBean.getMobileNumber());
            employeeModel = repository.save(employeeModel);
            employeeBean.setId(employeeModel.getId().toString());
        }
        return employeeBean;
    }

    @Override
    public List<EmployeeBean> getAllEmployees() {
        List<EmployeeModel> employeeModels = repository.findAll();
        return employeeModels.stream().map(EmployeeBean::new).collect(Collectors.toList());
    }

    @Override
    public EmployeeBean getEmployeeById(Integer id) {
        EmployeeModel employeeModel = repository.findById(id).orElse(null);
        return new EmployeeBean(employeeModel);
    }
}
