package com.bridgelabz.Bank_Management_System.service;

import com.bridgelabz.Bank_Management_System.dao.EmployeeRepository;
import com.bridgelabz.Bank_Management_System.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    public Employee getById(int id)
    {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(int id)
    {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Employee correctEmployee, int id)
    {
        Employee employee = employeeRepository.findById(id).get();

        if(employee.getEmail() != null)
        {
            employee.setEmail(correctEmployee.getEmail());
        }
        if(employee.getFirstName() != null)
        {
            employee.setFirstName(correctEmployee.getFirstName());
        }
        if(employee.getLastname() != null)
        {
            employee.setLastname(correctEmployee.getLastname());
        }
        if(employee.getDepartment() != null)
        {
            employee.setDepartment(correctEmployee.getDepartment());
        }

        return employeeRepository.save(employee);
    }
}
