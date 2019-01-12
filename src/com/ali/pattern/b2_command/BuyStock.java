package com.ali.pattern.b2_command;

public class BuyStock implements IOrder {

	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void excute() {
		stock.buy();
	}
}
