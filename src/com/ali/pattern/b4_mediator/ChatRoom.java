package com.ali.pattern.b4_mediator;

import java.util.Date;

public class ChatRoom {

	static void showMessage(User user, String msg) {
		System.out.println(new Date().toString() + " [ " + user.getName() + " ]" + msg);
	}
}
