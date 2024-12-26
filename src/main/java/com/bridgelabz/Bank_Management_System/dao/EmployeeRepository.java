package com.bridgelabz.Bank_Management_System.dao;

import com.bridgelabz.Bank_Management_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
