package com.example.testing.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeBean {

    private String id;
    private String name;
    private String email;
    private String mobileNumber;

    public EmployeeBean(EmployeeModel employeeModel) {
        if(employeeModel != null) {
            this.id = employeeModel.getId().toString();
            this.name = employeeModel.getName();
            this.email = employeeModel.getEmail();
            this.mobileNumber = employeeModel.getMobileNumber();
        }
    }
}
