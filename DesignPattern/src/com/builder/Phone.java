package com.builder;


public class Phone {

	private int ram;
	private String processor;
	private int battery;
	private String os;

	public Phone(int ram, String processor, int battery, String os) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
		this.os = os;
	}

	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", processor=" + processor + ", battery=" + battery + ", os=" + os + "]";
	}
	
	
}
