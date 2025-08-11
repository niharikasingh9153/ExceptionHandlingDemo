package org.example.entity;

public class BankAccount {
    private int custId;
    private String custName;
    private long custAccountNumber;
    private double custAccountBalanace;
    private int limit;

    public BankAccount(int custId, String custName, long custAccountNumber, double custAccountBalanace, int limit) {
        this.custId = custId;
        this.custName = custName;
        this.custAccountNumber = custAccountNumber;
        this.custAccountBalanace = custAccountBalanace;
        this.limit=limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustAccountNumber() {
        return custAccountNumber;
    }

    public void setCustAccountNumber(long custAccountNumber) {
        this.custAccountNumber = custAccountNumber;
    }

    public double getCustAccountBalanace() {
        return custAccountBalanace;
    }

    public void setCustAccountBalanace(double custAccountBalanace) {
        this.custAccountBalanace = custAccountBalanace;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAccountNumber=" + custAccountNumber +
                ", custAccountBalanace=" + custAccountBalanace +
                '}';
    }
}
