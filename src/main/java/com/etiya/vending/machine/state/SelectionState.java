package com.etiya.vending.machine.state;

import com.etiya.vending.machine.StateContext;

import java.util.Optional;
import java.util.Scanner;

public class SelectionState implements State {

    private static final SelectionState instance = new SelectionState();

    private SelectionState() {

    }

    public static SelectionState getInstance() {
        return instance;
    }

    @Override
    public void process(StateContext context) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Optional<State> nextStateMaybe = context.getState(input.toUpperCase());
        context.setState(nextStateMaybe.orElse(MenuState.getInstance()));
        if (!nextStateMaybe.isPresent()) {
            System.out.println("Please select correct options \n");
        }
    }
}
