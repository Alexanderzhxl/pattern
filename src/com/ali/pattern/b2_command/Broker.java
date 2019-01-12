package com.ali.pattern.b2_command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	public List<IOrder> list = new ArrayList<>();

	public void takeOrder(IOrder order) {
		list.add(order);
	}

	public void placeOrders() {
		for (IOrder order : list) {
			order.excute();
		}
		list.clear();
	}
}
