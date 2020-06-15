package com.etiya.vending.machine;

public enum MoneyType {

    HALF("HALF", 0.5), ONE("ONE", 1), FIVE("FIVE", 5), TEN("TEN", 10);

    private String name;
    private double value;

    MoneyType(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
