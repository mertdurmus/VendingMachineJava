package com.etiya.vending.machine.state;

import com.etiya.vending.machine.StateContext;

public interface State {
	
	 void process(StateContext context);

}
