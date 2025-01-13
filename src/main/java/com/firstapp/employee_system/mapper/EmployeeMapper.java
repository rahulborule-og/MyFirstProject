package com.firstapp.employee_system.mapper;

import com.firstapp.employee_system.dto.EmployeeDto;
import com.firstapp.employee_system.entity.Employee;


public class EmployeeMapper {
    public static EmployeeDto maptoEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getfirstname(),
                employee.getlastname(),
                employee.getemail()




        );

    }
}
