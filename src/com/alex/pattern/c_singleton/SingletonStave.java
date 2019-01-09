package com.alex.pattern.c_singleton;

public class SingletonStave {

	private static SingletonStave instance= new SingletonStave();
	private SingletonStave() {}
	public SingletonStave getInstance() {return instance;}
}
