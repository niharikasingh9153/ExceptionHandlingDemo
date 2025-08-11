package org.example.service;

import org.example.Exception.CheckedExceptions;
import org.example.Exception.UnsufficientBalanceException;
import org.example.entity.BankAccount;

public class BankAccountImplementation implements BankAccountService{

    @Override
    public double checkBalance(BankAccount account) {
        return account.getCustAccountBalanace();
    }
//unchecked Exception
    @Override
    public double withdrawAmount(BankAccount account, double amount)  {
        if (account.getCustAccountBalanace()<amount){
//            try {
                throw new UnsufficientBalanceException("Paisa kam hai");
//            }catch (UnsufficientBalanceException e){
//                System.out.println(e.getMessage());

//            }
        }else {
            account.setCustAccountBalanace(account.getCustAccountBalanace()-amount);
//            System.out.println("Done!!!!!");

        }
        return account.getCustAccountBalanace();
    }

    //Checked Exception
    @Override
    public double depositAmmount(BankAccount account, double amount) {
        if(amount>account.getLimit()){
            try {
                throw new CheckedExceptions("Problematic");
            }catch (CheckedExceptions e){
                System.out.println(e.getMessage());
            }
        } else {
            account.setCustAccountBalanace(account.getCustAccountBalanace() + amount);
        }
        return account.getCustAccountBalanace();
    }
}
