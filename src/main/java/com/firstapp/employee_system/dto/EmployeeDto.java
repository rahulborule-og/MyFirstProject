package com.firstapp.employee_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {

    private Long id;


    private String firstname;

    private String lastname;

    private String email;


    public EmployeeDto(Long id, String firstname, String lastname, String email) {
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;

    }



}
