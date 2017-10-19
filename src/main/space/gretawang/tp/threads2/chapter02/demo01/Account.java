package main.space.gretawang.tp.threads2.chapter02.demo01;

import java.util.concurrent.TimeUnit;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void addAmount(double amount) {
        double temp = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp+=amount;
        balance = temp;
    }

    public synchronized void substractAmount(double amount) {
        double temp = balance;

        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp-=amount;
        balance = temp;
    }
}
