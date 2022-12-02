package com.builder;

public class PhoneBuilder {

	private int ram;
	private String processor;
	private int battery;
	private String os;
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(ram, processor, battery, os);
	}
	
	
}
