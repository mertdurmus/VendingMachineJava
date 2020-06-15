package com.etiya.vending.machine.state.test;


import org.junit.jupiter.api.Test;

import com.etiya.vending.machine.Item;
import com.etiya.vending.machine.StateContext;
import com.etiya.vending.machine.state.SaleState;

class SaleStateTest {
	
	Item item = Item.FANTA;
	SaleState state = new SaleState(item);
	StateContext context = StateContext.getInstance();
	
	@Test
	public void processTest() {
		state.process(context);
	}

}
