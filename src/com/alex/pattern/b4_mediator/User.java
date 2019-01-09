package com.alex.pattern.b4_mediator;

public class User {

	String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String msg)
	{
		ChatRoom.showMessage(this, msg);
	}
}
