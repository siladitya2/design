package com.design.paatern.chain;

public interface Chain {
	
	void setNextChain(Chain chain);
	void calculate(int amount);

}
