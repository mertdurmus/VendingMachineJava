package com.etiya.vending.machine.state.test;



import org.junit.jupiter.api.Test;
import com.etiya.vending.machine.MoneyType;
import com.etiya.vending.machine.StateContext;
import com.etiya.vending.machine.state.TopUpState;

class TopUpStateTest {

	MoneyType moneyType = MoneyType.TEN;
	TopUpState state = new TopUpState(moneyType);
	
	StateContext context = StateContext.getInstance();
	
	@Test
	public void processTest() {
		state.process(context);
	}

}
