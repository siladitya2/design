package com.design.patterns.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		return 20;
	}

}
