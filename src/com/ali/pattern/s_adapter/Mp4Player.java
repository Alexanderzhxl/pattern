package com.ali.pattern.s_adapter;

public class Mp4Player implements IAdvancedMediaPlayer {

	@Override
	public void playLvc(String name) {

	}

	@Override
	public void playMp4(String name) {
		System.out.println("play mp4:" + name);
	}

}
