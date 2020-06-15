package com.etiya.vending.machine.state;

import com.etiya.vending.machine.Balance;
import com.etiya.vending.machine.StateContext;

public class ReturnState implements State {

	private static final ReturnState instance = new ReturnState();

	private ReturnState(){

	}

	public static ReturnState getInstance(){
		return instance;
	}
	@Override
	public void process(StateContext context) {
		System.out.println("Returning your money is:  " + Balance.getIntance().getBalance());
		System.out.println("bye!");
		System.exit(1);
	}
}
