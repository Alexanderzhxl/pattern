package com.ali.pattern.b2_command;

public class SellStock implements IOrder {

	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void excute() {
		stock.sell();
	}

}
