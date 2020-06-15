package com.etiya.vending.machine.state;

import com.etiya.vending.machine.StateContext;

public class NoMoneyState implements State {

	private static final NoMoneyState instance= new NoMoneyState();

	private NoMoneyState(){

	}

	public static NoMoneyState getInstance(){
		return instance;
	}

	@Override
	public void process(StateContext context) {
		System.out.println("No money, bye!");
		System.exit(1);
	}

}
