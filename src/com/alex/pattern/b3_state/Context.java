package com.alex.pattern.b3_state;

public class Context {

	IState state;
	
	public void setState(IState state) {
		this.state = state;
	}
	public IState getState() {
		return state;
	}
}
