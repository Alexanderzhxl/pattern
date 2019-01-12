package com.ali.pattern.b2_observer;

public class Student implements Observer {

	private String name;
	private String phone;
	private Teacher teacher;

	public Student(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
		this.teacher.attach(this);
	}

	@Override
	public void update() {
		phone = teacher.getPhone();
	}

	public void show() {
		System.out.println(name + phone);
	}
}
