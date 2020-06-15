package com.etiya.vending.machine.state.test;


import org.junit.jupiter.api.Test;
import com.etiya.vending.machine.state.ReturnState;
import com.etiya.vending.machine.StateContext;



class ReturnStateTest {

	ReturnState state = ReturnState.getInstance();
	StateContext context = StateContext.getInstance();
	
	@Test
	public void processTest() {
		state.process(context);
	}
}
