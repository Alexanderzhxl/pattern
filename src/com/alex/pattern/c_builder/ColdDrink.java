package com.alex.pattern.c_builder;

public class ColdDrink implements IItem {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "cold drick";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public IPacking packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
