package org.example.service;

import org.example.Exception.UnsufficientBalanceException;
import org.example.entity.BankAccount;

public interface BankAccountService {
    public double checkBalance(BankAccount account);
    public double withdrawAmount(BankAccount account, double amount);
    public double depositAmmount(BankAccount account, double amount);
}
