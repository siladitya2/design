package com.design.patterns.command;

public class LightOffCommandImpl implements Command {
	Light light;

	LightOffCommandImpl(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();

	}
}
