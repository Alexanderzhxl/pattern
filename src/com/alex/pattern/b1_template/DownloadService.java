package com.alex.pattern.b1_template;

/**
 * http://www.runoob.com/design-pattern/template-pattern.html
 * https://blog.csdn.net/ArimaKisho/article/details/80283794
 * 
 * @author xiyu
 *
 */
public abstract class DownloadService {

	public final void onHandleIntent() {

		onDownloadStart();
		int progress = 0;
		while (progress < 100) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			progress++;
			onDownloadProgress(progress);
		}
		onDownloadSuccess();
	}

	protected abstract void onDownloadStart();

	protected abstract void onDownloadProgress(int progress);

	protected abstract void onDownloadSuccess();

	protected abstract void onDownloadFail();
}
