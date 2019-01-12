package com.ali.pattern.s_proxy;

public class ProxyImage implements IImage {

	private IImage image;
	private String filename;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.display();
	}

}
