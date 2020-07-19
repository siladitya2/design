package com.design.patterns.command;

public class Light {

	public void on() {
		System.out.println("receiving command..");
		System.out.println("light on");
	}

	public void off() {
		System.out.println("receiving command..");
		System.out.println("light off");
	}

}
