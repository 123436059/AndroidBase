package com.example.administrator.androidbase.main.pushMessageDialog;

/**
 * Created by Administrator on 2016/3/19.
 */
public class PushMessageManager {
	private static PushMessageManager messageManager;
	private PushMessageManager() {
	}

	public static PushMessageManager getInstance() {
		if (messageManager == null) {
			messageManager = new PushMessageManager();
		}
		return messageManager;
	}

}
