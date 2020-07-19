package com.design.patterns.chain;

public class TestChain {

	public static void main(String[] args) {
		Chain first=new ChainOfFifty();
		Chain sec=new ChainOfTwenty();
		Chain third=new ChainOfTen();
		
		first.setNextChain(sec);
		sec.setNextChain(third);
		
		
		first.calculate(630);
		
		
		
	}

}
