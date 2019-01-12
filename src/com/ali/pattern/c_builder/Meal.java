package com.ali.pattern.c_builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	List<IItem> list = new ArrayList<>();
	
	public void addItem(IItem item) {
		list.add(item);
	}
	public float getCost() {
		float price = 0;
		for(IItem item: list)
		{
			price += item.getPrice();
		}
		return price;
	}
	public void showItems() {
		for(IItem item : list)
		{
			System.out.println(item.getName()+" "+item.getPrice()+" "+item.packing());
		}
	}
}
