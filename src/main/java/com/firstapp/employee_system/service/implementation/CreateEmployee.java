package com.firstapp.employee_system.service.implementation;

import com.firstapp.employee_system.dto.EmployeeDto;
import com.firstapp.employee_system.entity.Employee;
import com.firstapp.employee_system.mapper.EmployeeEntityMapper;
import com.firstapp.employee_system.mapper.EmployeeMapper;
import com.firstapp.employee_system.repository.EmployeeRepository;
import com.firstapp.employee_system.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CreateEmployee implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeedto) {
        Employee employee= EmployeeEntityMapper.maptoEmployee(employeedto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(employee);

    }
}
