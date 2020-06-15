package com.etiya.vending.machine;

import com.etiya.vending.machine.state.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StateContext {

    private static final StateContext instance = new StateContext();
    private Map<String, State> states = new HashMap<>();

    private State state;

    private StateContext() {
        state = MenuState.getInstance();
        states.putAll(Stream.of(Item.values()).collect(
                Collectors.toMap(Item::getName, SaleState::new)));
        states.putAll(Stream.of(MoneyType.values()).collect(
                Collectors.toMap(MoneyType::getName, TopUpState::new)));
        states.put("RETURN", ReturnState.getInstance());
    }

    public static StateContext getInstance() {
        return instance;
    }

    public void setState(State newState) {
        state = newState;
    }

    public void process() {
        state.process(this);
    }

    public Optional<State> getState(String name) {
        return Optional.ofNullable(states.get(name));
    }
}
