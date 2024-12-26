package com.bridgelabz.Bank_Management_System.controller;

import com.bridgelabz.Bank_Management_System.entity.Account;
import com.bridgelabz.Bank_Management_System.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/save")
    public Account createAccount(@RequestBody Account account)
    {
        return accountService.createAccount(account);
    }

    @GetMapping("/getAll")
    public List<Account> getAllAccount()
    {
        return accountService.getAllAccount();
    }

    @GetMapping("/get/{accno}")
    public Account getAccount(@PathVariable long accno)
    {
        return accountService.getAccount(accno);
    }

    @DeleteMapping("/delete/{accno}")
    public String deleteAccount(@PathVariable long accno)
    {
        accountService.deleteAccount(accno);
        return "Account Deleted Successfully....";
    }

    @PutMapping("/update/{accno}")
    public Account updateAccount(@RequestBody Account account, @PathVariable long accno)
    {
        return accountService.updateAccount(account,accno);
    }



}
