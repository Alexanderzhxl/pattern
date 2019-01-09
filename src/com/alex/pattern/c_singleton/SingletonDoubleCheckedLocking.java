package com.alex.pattern.c_singleton;

public class SingletonDoubleCheckedLocking {

	private volatile static SingletonDoubleCheckedLocking instance;

	private SingletonDoubleCheckedLocking() {
	}

	public SingletonDoubleCheckedLocking getInstance() {
		if (instance == null) {

			synchronized (SingletonDoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckedLocking();
				}
			}
		}

		return instance;
	}
}