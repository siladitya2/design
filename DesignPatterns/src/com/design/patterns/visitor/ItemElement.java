package com.design.patterns.visitor;

public interface ItemElement {

	int accept(ShoppingCartVisitor visitor);
}
