package com.ali.pattern.b3_state;

public class EndState implements IState {

	@Override
	public void doAction(Context context) {
		System.out.println("player is in end state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "End State";
	}

}
