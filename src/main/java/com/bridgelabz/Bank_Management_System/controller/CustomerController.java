package com.bridgelabz.Bank_Management_System.controller;

import com.bridgelabz.Bank_Management_System.entity.Customer;
import com.bridgelabz.Bank_Management_System.service.CustomerSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

     @Autowired
    CustomerSerivice customerSerivice;

    @PostMapping("/save")
    public Customer createCustomer(@RequestBody Customer customer)
    {
        return customerSerivice.createCustomer(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomer()
    {
        return customerSerivice.getAllCustomer();
    }

    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable int id)
    {
        return customerSerivice.getCustomerById(id);
    }

    @DeleteMapping("remove/{id}")
    public String deleteCustomer(@PathVariable int id)
    {
        customerSerivice.deleteCustomer(id);
        return "Remove Customer Successfully....";
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id)
    {
        return customerSerivice.updateCustomer(customer,id);
    }
}
