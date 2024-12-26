package com.bridgelabz.Bank_Management_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Manager {

    @Id
    private int id;
    private String name;
    private String position;
    private int age;


}
