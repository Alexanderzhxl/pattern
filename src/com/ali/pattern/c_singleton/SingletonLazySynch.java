package com.ali.pattern.c_singleton;

public class SingletonLazySynch {
	
	private static SingletonLazySynch instance;
	private SingletonLazySynch() {}
	public synchronized SingletonLazySynch getIntance()
	{
		if(instance == null)
		{
			instance = new SingletonLazySynch();
		}
		return instance;
	}

}
