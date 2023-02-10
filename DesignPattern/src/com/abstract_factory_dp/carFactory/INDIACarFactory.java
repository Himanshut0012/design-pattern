package com.abstract_factory_dp.carFactory;

import com.abstract_factory_dp.car.Cars;
import com.abstract_factory_dp.car.LuxuryCar;
import com.abstract_factory_dp.car.MicroCar;
import com.abstract_factory_dp.car.MiniCar;
import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class INDIACarFactory {

	public static Cars carBuilder(CarType model) {
		Cars car = null;
		switch(model) {
		case MICRO:
			car=new MicroCar(Location.INDIA);
			break;
			
		case MINI:
			car= new MiniCar(Location.INDIA);
			break;
			
		case LUXURY:
			car=new LuxuryCar(Location.INDIA);
			break;
			
			default:
			break;
		}
		return car;
	}
}
