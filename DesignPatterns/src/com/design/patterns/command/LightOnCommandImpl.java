package com.design.patterns.command;

public class LightOnCommandImpl implements Command {
	Light light;
	
	LightOnCommandImpl(Light light){
		this.light=light;
	}

	@Override
	public void execute() {
		light.on();

	}
}
