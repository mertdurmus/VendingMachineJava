package com.etiya.vending.machine;

public enum Item {
    KOLA("KOLA", 15), FANTA("FANTA", 20), GAZOZ("GAZOZ", 30);

    private String name;
    private double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}