package com.abstract_factory_dp.car;

import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class LuxuryCar extends Cars {

	public LuxuryCar( Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("This is Luxury Car...!");
		
	}

}
