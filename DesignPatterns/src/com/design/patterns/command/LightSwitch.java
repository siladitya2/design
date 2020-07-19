package com.design.patterns.command;

public class LightSwitch {

	public void execute(Command command) {
		System.out.println("invoking command..");
		command.execute();
	}

}
