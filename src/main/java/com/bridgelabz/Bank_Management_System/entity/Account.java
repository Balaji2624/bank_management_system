package com.bridgelabz.Bank_Management_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Account {

    @Id
    private long accno;
    private String accHolderName;
    private String accType;
    private String bankName;
    private long accbalance;

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(long accbalance) {
        this.accbalance = accbalance;
    }
}
