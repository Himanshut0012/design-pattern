package com.strategy.main_class;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		
		Vehicle obj = new NormalVehicle();
		obj.display();
		
		Vehicle obj2 = new RacerVehicle();
		obj2.display();

	}

}
