package com.bridgelabz.Bank_Management_System.service;

import com.bridgelabz.Bank_Management_System.dao.AccountRepository;
import com.bridgelabz.Bank_Management_System.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(Account account)
    {
        return accountRepository.save(account);
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public Account getAccount(long accno) {
        return accountRepository.findById(accno).get();
    }

    public void deleteAccount(long accno) {

        accountRepository.deleteById(accno);
    }

    public Account updateAccount(Account correctAccount, long accno) {

        Account account = accountRepository.findById(accno).get();

        if(account.getAccno() != 0)
        {
            account.setAccno(correctAccount.getAccno());
        }
        if(account.getAccHolderName() != null)
        {
            account.setAccHolderName(correctAccount.getAccHolderName());
        }
        if(account.getAccbalance() != 0)
        {
            account.setAccbalance(correctAccount.getAccbalance());
        }
        if(account.getBankName() != null)
        {
            account.setBankName(correctAccount.getBankName());
        }
        if(account.getAccType() != null)
        {
            account.setAccType(correctAccount.getAccType());
        }
        return accountRepository.save(account);
    }
}
