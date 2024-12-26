package com.bridgelabz.Bank_Management_System.service;

import com.bridgelabz.Bank_Management_System.dao.ManagerRepository;
import com.bridgelabz.Bank_Management_System.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public Manager createManager(Manager manager)
    {
        return managerRepository.save(manager);
    }

    public List<Manager> getAllManager() {

        return managerRepository.findAll();
    }

    public Manager getManagerById(int id)
    {
        return managerRepository.findById(id).get();
    }

    public  void deleteManager(int id)
    {
        managerRepository.deleteById(id);
    }

    public Manager updateManager(Manager correctManager, int id) {

        Manager manager = managerRepository.findById(id).get();

        if(manager.getName() != null)
        {
            manager.setName(correctManager.getName());
        }
        if(manager.getAge() != 0)
        {
            manager.setAge(correctManager.getAge());
        }
        if(manager.getPosition() != null) {
            manager.setPosition(correctManager.getPosition());
        }
        if(manager.getId() != 0)
        {
            manager.setId(correctManager.getId());
        }
        return managerRepository.save(manager);
    }
}
