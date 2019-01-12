package com.ali.pattern.b2_chain_of_responsibility;

public class ChainOfResponsibility {

	private static int INFO = 1;
	private static int DEBUG = 2;
	private static int ERROR = 3;

	public static AbstractLogger getChainOfLogger() {
		AbstractLogger error = new ErrorLogger(ERROR);
		AbstractLogger file = new FileLogger(DEBUG);
		AbstractLogger console = new ConsoleLogger(INFO);

		error.setNextLogger(file);
		file.setNextLogger(console);

		return error;
	}
}
