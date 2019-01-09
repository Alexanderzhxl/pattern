package com.alex.pattern.s_adapter;

public class AudioPlayer implements IMediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String name) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("play mp3:" + name);
		} else if ("mp4".equalsIgnoreCase(audioType) || "lvc".equalsIgnoreCase(audioType)) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, name);
		}else {
			System.out.println("不支持格式" + audioType);
		}
	}
}
