package com.example.demo.Entity;

import jakarta.persistence.Entity;

@Entity
public class Department extends BaseEntity {


    private String name;


    public Department() {
    }

    public Department(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}