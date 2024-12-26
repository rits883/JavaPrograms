package com.models;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private Integer empId;
    private  String email;
    private  String department;



    public Employee (String name , Integer empId, String email, String department){
        this.name=name;
        this.empId =empId;
        this.email =email;
        this.department =department;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
