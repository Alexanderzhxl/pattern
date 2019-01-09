package com.alex.pattern.b2_observer;

import java.util.Vector;

public class Teacher implements Subject {

	private String phone;
	private Vector<Observer> students;

	public Teacher() {
		phone = "";
		students = new Vector<>();
	}

	@Override
	public void attach(Observer observer) {
		students.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		students.remove(observer);
	}

	@Override
	public void notice() {
		for (int i = 0; i < students.size(); i++) {
			((Observer) students.get(i)).update();
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		notice();
	}

}
