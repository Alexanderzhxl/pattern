package com.alex.pattern.s_adapter;

public class LvcPlayer implements IAdvancedMediaPlayer {

	@Override
	public void playLvc(String name) {
		System.out.println("play lvc:" + name);
	}

	@Override
	public void playMp4(String name) {
		//System.out.println("play mp4:" + name);
	}

}
