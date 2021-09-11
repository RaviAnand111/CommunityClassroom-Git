package com.javarevision;

public class Bank {

    int AccountNumber, Balance;
    String CustomerName, Email;
    int PhoneNumber;

     Bank(String customerName, int accountNumber){
        CustomerName = customerName;
        AccountNumber = accountNumber;
    }

    Bank(String customerName, int accountNumber, int balance, String email, int phoneNumber){
        AccountNumber = accountNumber;
        Balance = balance;
        CustomerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void DepositFund(int fund){
        if(fund > 0) {
            Balance += fund;
            System.out.println("Fund Deposited Successfully");
        }else System.out.println("Fund entered not possible");
    }

    public void WithdrawFund(int fund){
        if(fund > Balance || Balance == 0) System.out.println("Balance Not Sufficient to make the withdrawal");
        else{
            Balance -= fund;
            System.out.println("WITHDRAWAL COMPLETE\n Take INR " + fund + "/- from the counter");
        }
    }
}
