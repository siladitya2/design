package com.design.patterns.visitor;

public class TestVisitor {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(), new Book(), new Fruit(), new Fruit() };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
