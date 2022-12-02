package com.builder;

public class BuilderDesignPattern {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setBattery(5000).setOs("windows").setProcessor("Octa-Core").setRam(32).getPhone();
		System.out.println(phone);
	}

}
	