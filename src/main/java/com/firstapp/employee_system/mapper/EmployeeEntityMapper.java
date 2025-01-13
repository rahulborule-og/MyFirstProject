package com.firstapp.employee_system.mapper;

import com.firstapp.employee_system.dto.EmployeeDto;
import com.firstapp.employee_system.entity.Employee;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeEntityMapper{
    public static Employee maptoEmployee(EmployeeDto empdto){
        return new Employee(
                empdto.getId(),
                empdto.getemail(),
                empdto.getfirstname(),
                empdto.getlastname()
        );

    }
}
