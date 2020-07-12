package com.design.paatern.chain;

public class ChainOfFifty implements Chain {

	Chain nextChain;

	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;

	}

	@Override
	public void calculate(int amount) {
		if (amount / 50 > 0) {
			int num50 = amount / 50;
			System.out.println("number of 50:" + num50);
			if (amount % 50 > 0) {
				this.nextChain.calculate(amount % 50);
			}
		}
	}

}
