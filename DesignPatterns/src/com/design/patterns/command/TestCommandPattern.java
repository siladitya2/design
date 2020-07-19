package com.design.patterns.command;

public class TestCommandPattern {

	public static void main(String[] args) {

		Light light = new Light();

		Command lightOnCommand = new LightOnCommandImpl(light);
		Command lightOffCommand = new LightOffCommandImpl(light);

		LightSwitch ls = new LightSwitch();

		ls.execute(lightOnCommand);
		ls.execute(lightOffCommand);
	}
}
