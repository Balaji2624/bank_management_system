package com.bridgelabz.Bank_Management_System.service;

import com.bridgelabz.Bank_Management_System.dao.CustomerRepository;
import com.bridgelabz.Bank_Management_System.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSerivice {

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    public void deleteCustomer(int id)
    {
        customerRepository.deleteById(id);
    }


    public Customer updateCustomer(Customer correctCustomer, int id) {

        Customer customer = customerRepository.findById(id).get();

        if(customer.getName() != null)
        {
            customer.setName(correctCustomer.getName());
        }
        if(customer.getAddress() != null)
        {
            customer.setAddress(correctCustomer.getAddress());
        }
        if(customer.getAge() != 0)
        {
            customer.setAge(correctCustomer.getAge());
        }
        if(customer.getContact() != 0)
        {
            customer.setContact(correctCustomer.getContact());
        }
        if(customer.getEmail() != null)
        {
            customer.setEmail(correctCustomer.getEmail());
        }
        return customerRepository.save(customer);
    }
}
