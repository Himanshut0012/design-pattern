package com.abstract_factory_dp.car;

import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class MicroCar extends Cars{

	public MicroCar( Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("this is micro car...!");
	}

}
