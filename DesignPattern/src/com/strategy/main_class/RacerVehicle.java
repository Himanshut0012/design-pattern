package com.strategy.main_class;

import com.strategy.drive_type.SportDrive;

public class RacerVehicle extends Vehicle {

	public RacerVehicle() {
		super(new SportDrive());
	}

}
