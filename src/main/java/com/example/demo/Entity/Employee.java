package com.example.demo.Entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Employee extends BaseEntity {
    private String name;


    private String phoneNumber;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }






    public Employee() {
    }
    public Employee(String name, String phoneNumber, BigDecimal salary) {
        this.name = name;

        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }


}