package com.design.patterns.visitor;

public class Fruit implements ItemElement {

	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}

}
