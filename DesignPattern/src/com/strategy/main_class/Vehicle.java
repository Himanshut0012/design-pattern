package com.strategy.main_class;

import com.strategy.drive_type.DriveStrategy;

public class Vehicle  {
	
	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}
	
	public void display() {
		driveStrategy.drive();
	}
	

}
