package com.design.patterns.visitor;

public class Book implements ItemElement {

	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}

}
