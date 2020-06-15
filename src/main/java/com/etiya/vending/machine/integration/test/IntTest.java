package com.etiya.vending.machine.integration.test;

import org.junit.jupiter.api.Test;

import com.etiya.vending.machine.Balance;
import com.etiya.vending.machine.Item;
import com.etiya.vending.machine.MoneyType;
import com.etiya.vending.machine.StateContext;
import com.etiya.vending.machine.state.SaleState;
import com.etiya.vending.machine.state.TopUpState;

class IntTest {
	
	Balance balance = Balance.getIntance();
	MoneyType moneyType = MoneyType.TEN;
	TopUpState stateTopUp = new TopUpState(moneyType);
	StateContext context = StateContext.getInstance();
	Item item = Item.FANTA;
	SaleState stateSale = new SaleState(item);
	
	@Test
	public void processTestCase1() {
		stateTopUp.process(context);
		stateSale.process(context);
		
	}
	
	@Test
	public void processTestCase2() {
		stateTopUp.process(context);
		stateTopUp.process(context);
		stateSale.process(context);
		
	}
	

}
