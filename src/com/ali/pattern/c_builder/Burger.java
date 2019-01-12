package com.ali.pattern.c_builder;

public class Burger implements IItem {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Burger";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public IPacking packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
