package com.apro;

public class Operations {

    public static void main(String[] args) {

        Account a = new Account(1000);
        Account b = new Account(2000);

        new Thread(() -> {
            transfer(a, b, 300);
        });

        transfer(b, a, 200);


    }

    private static void transfer(Account from, Account to, int amount) {
        assert from.getBalance() < 0 : "Insufficient funds";
        from.withdraw(amount);
        to.deposit(amount);
    }
}
