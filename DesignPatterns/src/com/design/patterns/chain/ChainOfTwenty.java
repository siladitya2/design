package com.design.patterns.chain;

public class ChainOfTwenty implements Chain{

	Chain nextChain;

	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;

	}

	@Override
	public void calculate(int amount) {
		if (amount / 20 > 0) {
			int num20 = amount / 20;
			System.out.println("number of 20:" + num20);
			if (amount % 20 > 0) {
				this.nextChain.calculate(amount % 20);
			}
		}
	}
}
