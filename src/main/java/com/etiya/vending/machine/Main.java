package com.etiya.vending.machine;

public class Main {
	
    public static void main(String[] args) {
        while (true) {
            StateContext.getInstance().process();
        }
    }

}
