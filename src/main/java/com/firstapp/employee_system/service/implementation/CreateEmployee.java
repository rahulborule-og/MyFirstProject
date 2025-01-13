package com.firstapp.employee_system.service.implementation;

import com.firstapp.employee_system.dto.EmployeeDto;
import com.firstapp.employee_system.entity.Employee;
import com.firstapp.employee_system.exceptions.ResourceNotAvailable;
import com.firstapp.employee_system.mapper.EmployeeEntityMapper;
import com.firstapp.employee_system.mapper.EmployeeMapper;
import com.firstapp.employee_system.repository.EmployeeRepository;
import com.firstapp.employee_system.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    @Override
    public EmployeeDto getEmployeeId(Long id) {
        Employee emp=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotAvailable("Resource is not available"+id));
        return EmployeeMapper.maptoEmployeeDto(emp);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> employeelist=employeeRepository.findAll();

        return employeelist.stream().map((employee)->EmployeeMapper.maptoEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployeeDetails) {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotAvailable("No resource with this is id"+id));
        employee.setfirstname(updatedEmployeeDetails.getfirstname());
        employee.setemail(updatedEmployeeDetails.setemail());
        employee.setlastname(updatedEmployeeDetails.setlastname());

        Employee updatedemployeeobject=employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(updatedemployeeobject);


    }

    @Override
    public void deleteEmployee(Long id) {
         Employee e=employeeRepository.findById(id).orElseThrow(()->new ResourceNotAvailable("This resource is not available"+id));
         employeeRepository.deleteById(id);
    }



}
