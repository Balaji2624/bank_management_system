package com.bridgelabz.Bank_Management_System.controller;

import com.bridgelabz.Bank_Management_System.entity.Manager;
import com.bridgelabz.Bank_Management_System.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @PostMapping("/save")
    public Manager createManager(@RequestBody Manager manager)
    {
        return managerService.createManager(manager);
    }

    @GetMapping("/getAll")
    public List<Manager> getAllManager()
    {
        return managerService.getAllManager();
    }

    @GetMapping("/get/{id}")
    public Manager getManagerById(@PathVariable int id)
    {
        return managerService.getManagerById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteManager(@PathVariable int id)
    {
        managerService.deleteManager(id);
        return "Remove the Manager Successfully....";
    }

    @PutMapping("/update/{id}")
    public Manager updateManager(@RequestBody Manager manager, @PathVariable int id)
    {
        return managerService.updateManager(manager,id);
    }

}
