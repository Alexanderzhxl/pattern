package com.ali.pattern.s_adapter;

public class MediaAdapter implements IMediaPlayer {

	IAdvancedMediaPlayer advancedPlayer;

	public MediaAdapter(String audioType) {
		if ("mp4".equalsIgnoreCase(audioType)) {
			advancedPlayer = new Mp4Player();
		} else if ("lvc".equalsIgnoreCase(audioType)) {
			advancedPlayer = new LvcPlayer();
		}
	}

	@Override
	public void play(String audioType, String name) {
		if ("mp4".equalsIgnoreCase(audioType)) {
			advancedPlayer.playMp4(name);
		} else if ("lvc".equalsIgnoreCase(audioType)) {
			advancedPlayer.playLvc(name);
		} else {
			System.out.println("不支持格式" + audioType);
		}
	}

}
