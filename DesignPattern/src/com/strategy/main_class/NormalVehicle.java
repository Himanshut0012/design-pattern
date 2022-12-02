package com.strategy.main_class;

import com.strategy.drive_type.NormalDrive;

public class NormalVehicle extends Vehicle {

	public NormalVehicle() {
		super(new NormalDrive() );
	}

}
