package com.abstract_factory_dp;

import com.abstract_factory_dp.car.Cars;
import com.abstract_factory_dp.carFactory.DefaultCarFactory;
import com.abstract_factory_dp.carFactory.INDIACarFactory;
import com.abstract_factory_dp.carFactory.USACarFactory;
import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class CarFactory {

	private CarFactory() {
		
	}
	public static Cars buildCar(CarType model) {
		Cars car = null;
		Location location = Location.INDIA;
		switch(location) {
		case USA:
			car=new USACarFactory().carBuilder(model);
			break;
			
		case INDIA:
			car = new INDIACarFactory().carBuilder(model);
			break;
		case DEFAULT:
			car = new DefaultCarFactory().carBuilder(model);
			break;
			
			default:
				break;
		}
		return car;
	}
}
