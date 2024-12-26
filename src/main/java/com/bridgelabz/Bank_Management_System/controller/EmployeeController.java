package com.bridgelabz.Bank_Management_System.controller;

import com.bridgelabz.Bank_Management_System.entity.Employee;
import com.bridgelabz.Bank_Management_System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAll();
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable int id)
    {
        return employeeService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        employeeService.deleteEmployee(id);
        return "Remove the Employee Successfully....";
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id)
    {
        return employeeService.updateEmployee(employee,id);
    }

}
