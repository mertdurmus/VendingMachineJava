package com.etiya.vending.machine.state;

import com.etiya.vending.machine.Balance;
import com.etiya.vending.machine.MoneyType;
import com.etiya.vending.machine.StateContext;

public class TopUpState implements State {
	
	private final MoneyType type;

	public TopUpState(MoneyType type) {
		this.type = type;
	}

	@Override
	public void process(StateContext context) {
		Balance.getIntance().increment(type.getValue());
		context.setState(MenuState.getInstance());
	}

}
