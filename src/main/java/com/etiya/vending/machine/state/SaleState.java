package com.etiya.vending.machine.state;


import com.etiya.vending.machine.Balance;
import com.etiya.vending.machine.Item;
import com.etiya.vending.machine.StateContext;

public class SaleState implements State {
	
    private final Item item;

    public SaleState(Item item) {
        this.item = item;
    }

    @Override
    public void process(StateContext context) {
        if (Balance.getIntance().getBalance() >= item.getPrice()) {
            Balance.getIntance().decrement(item.getPrice());
            System.out.println("Thank you for your purchase!! ");
        } else {
            System.out.println("not enough money for shopping insert more money\n ");
        }

        if (Balance.getIntance().getBalance() == 0) {
            context.setState(NoMoneyState.getInstance());
        } else {
            context.setState(MenuState.getInstance());
        }
    }

}
