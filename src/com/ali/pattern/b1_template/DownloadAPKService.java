package com.ali.pattern.b1_template;

public class DownloadAPKService extends DownloadService {

	@Override
	protected void onDownloadStart() {
		System.out.println("start");
	}

	@Override
	protected void onDownloadProgress(int progress) {
		System.out.println("progress:" + progress);
	}

	@Override
	protected void onDownloadSuccess() {
		System.out.println("success");
	}

	@Override
	protected void onDownloadFail() {
		System.out.println("fail");
	}
}
