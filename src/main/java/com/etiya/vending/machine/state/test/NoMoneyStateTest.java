package com.etiya.vending.machine.state.test;



import org.junit.jupiter.api.Test;
import com.etiya.vending.machine.StateContext;
import com.etiya.vending.machine.state.NoMoneyState;

class NoMoneyStateTest {

	NoMoneyState state = NoMoneyState.getInstance();
	StateContext context = StateContext.getInstance();
	
	@Test
	public void processTest() {
		state.process(context);
	}

}
