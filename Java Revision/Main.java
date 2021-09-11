package com.javarevision;

public class Main {

    public static void main(String[] args) {

        Bank ravi = new Bank("Ravi Anand", 1234567891);
        ravi.setPhoneNumber(836835416);
        ravi.setEmail("yravianand111@gmail.com");
        ravi.setBalance(100000);

        ravi.DepositFund(10000);
        System.out.println("Balance : " + ravi.getBalance());

        ravi.WithdrawFund(10000000);

    }
}
