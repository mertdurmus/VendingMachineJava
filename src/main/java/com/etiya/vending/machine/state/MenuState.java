package com.etiya.vending.machine.state;

import com.etiya.vending.machine.Balance;
import com.etiya.vending.machine.Item;
import com.etiya.vending.machine.StateContext;

public class MenuState implements State {
	
	private static final String itemShow = "%S :( %S TL)";


    private static final MenuState instance=new MenuState();

    private MenuState() {
    }

    public static MenuState getInstance(){
        return instance;
    }

    @Override
    public void process(StateContext context) {
        System.out.println("Your balance is " + Balance.getIntance().getBalance());
        System.out.println("Insert coins in the form of: HALF, ONE, FIVE, TEN");
        System.out.println("Select Item: \n");
        for (Item item : Item.values()) {
        	String output = String.format(itemShow, item.getName(), item.getPrice());
        	System.out.println(output);
        }
        System.out.println("RETURN");

        context.setState(SelectionState.getInstance());
    }


}
