package com.alex.pattern.b2_chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Console:" + message);
	}

}
