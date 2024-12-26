package com.bridgelabz.Bank_Management_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    private int id;
    private String name;
    private int age;
    private String address;
    private long contact;
    private String email;





}
