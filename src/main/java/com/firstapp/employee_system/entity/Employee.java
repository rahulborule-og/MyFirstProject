package com.firstapp.employee_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    @Column(name="first_name")
    private String firstname;
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }
    public String getfirstname(){
        return firstname;
    }
    @Column(name="last_name")
    private String lastname;
    public void setlastname(String lastname){
        this.lastname=lastname;
    }
    public String getlastname(){
        return lastname;
    }
    @Column(name="email",nullable = false,unique = true)
    private String email;
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    public Employee(Long id, String firstname, String lastname,String email){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    };
}
