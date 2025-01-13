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
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }



    private String firstname;
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }
    public String getfirstname(){
        return firstname;
    }

    private String lastname;
    public void setlastname(String lastname){
        this.lastname=lastname;
    }
    public String getlastname(){
        return lastname;
    }


    private String email;
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }


    public EmployeeDto(Long id, String firstname, String lastname, String email) {
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;

    }


    public String setemail() {
        return email;
    }

    public String setlastname() {
        return lastname;
    }
}
