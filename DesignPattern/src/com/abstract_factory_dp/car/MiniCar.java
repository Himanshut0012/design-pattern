package com.abstract_factory_dp.car;

import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class MiniCar extends Cars {

	public MiniCar( Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("this is mini car ..!");
	}

}
