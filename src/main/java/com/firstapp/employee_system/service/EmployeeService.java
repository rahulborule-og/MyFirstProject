package com.firstapp.employee_system.service;

import com.firstapp.employee_system.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeedto);
    EmployeeDto getEmployeeId(Long id);
    List<EmployeeDto> getAllEmployee();
    EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployeeDetails);
}
