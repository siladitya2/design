package com.design.paatern.chain;

public class ChainOfTen implements Chain {

	Chain nextChain;

	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;

	}

	@Override
	public void calculate(int amount) {

		int num10 = amount / 10;
		System.out.println("number of 10:" + num10);
	}

}
