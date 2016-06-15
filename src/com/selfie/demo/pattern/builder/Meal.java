package com.selfie.demo.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float total = 0.0f;
		for (Item item : items) {
			total += item.price();
		}

		return total;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.name());
			System.out.println(", Packing: " + item.packing());
			System.out.println(", Price: " + item.price());
		}
	}

}
