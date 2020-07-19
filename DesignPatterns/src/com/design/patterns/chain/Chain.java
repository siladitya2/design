package com.design.patterns.chain;

public interface Chain {
	
	void setNextChain(Chain chain);
	void calculate(int amount);

}
