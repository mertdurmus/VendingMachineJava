package com.etiya.vending.machine.state.test;


import org.junit.jupiter.api.Test;
import com.etiya.vending.machine.StateContext;
import com.etiya.vending.machine.state.SelectionState;

class SelectionStateTest {

	SelectionState state = SelectionState.getInstance();
	StateContext context = StateContext.getInstance();
	
	@Test
	public void processTest() {
		state.process(context);
	}

}
