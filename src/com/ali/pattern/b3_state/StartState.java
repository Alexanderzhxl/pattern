package com.ali.pattern.b3_state;

public class StartState implements IState {

	@Override
	public void doAction(Context context) {
		System.out.println("player is in start state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State";
	}

	
}
