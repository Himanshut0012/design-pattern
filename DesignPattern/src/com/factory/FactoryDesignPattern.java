package com.factory;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		
		OpratringSystemFactory osf= new OpratringSystemFactory();
		
		OpratingSystem obj =osf.getInstance("windows");
		
		try {
			obj.run();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
