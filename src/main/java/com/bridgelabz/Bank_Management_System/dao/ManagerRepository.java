package com.bridgelabz.Bank_Management_System.dao;

import com.bridgelabz.Bank_Management_System.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Integer> {

}
