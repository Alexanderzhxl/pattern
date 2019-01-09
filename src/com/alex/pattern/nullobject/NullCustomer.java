package com.alex.pattern.nullobject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "not available in db";
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
