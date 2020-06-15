package com.etiya.vending.machine;

public class Balance {
    private double balance = 0;

    private static final Balance intance = new Balance();

    private Balance() {

    }

    public double getBalance(){
        return balance;
    }

    public void increment(double value){
        balance+=value;
    }
    public void decrement(double value){
        balance-=value;
    }

    public static Balance getIntance() {
        return intance;
    }
}

