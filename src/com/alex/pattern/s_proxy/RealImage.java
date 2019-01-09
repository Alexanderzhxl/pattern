package com.alex.pattern.s_proxy;

public class RealImage implements IImage {

	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk(filename);
	}

	@Override
	public void display() {
		System.out.println("display " + filename);
	}

	private void loadFromDisk(String filename) {
		System.out.println("loading " + filename);
	}
}
