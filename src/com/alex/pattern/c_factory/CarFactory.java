package com.alex.pattern.c_factory;

public class CarFactory {

	public Car getOjb(String objName) {
		if (objName == null) {
			return null;
		}
		if (objName == "Baoma") {
			return new BaomaCar();
		} else if (objName == "Benchi") {
			return new BenchiCar();
		}

		return null;
	}
}

interface Car {
	void Drive();
}

class BaomaCar implements Car {

	@Override
	public void Drive() {
		// TODO Auto-generated method stub

	}

}

class BenchiCar implements Car {

	@Override
	public void Drive() {
		// TODO Auto-generated method stub

	}

}
