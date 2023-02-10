package com.abstract_factory_dp.carFactory;

import com.abstract_factory_dp.car.Cars;
import com.abstract_factory_dp.car.LuxuryCar;
import com.abstract_factory_dp.car.MiniCar;
import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public class DefaultCarFactory {

	public static Cars carBuilder(CarType model) {
		Cars car = null;
		switch(model) {
		case MINI:
			car = new MiniCar(Location.DEFAULT);
			break;
		case MICRO:
			car=new MiniCar(Location.DEFAULT);
			break;
		case LUXURY:
			car=new LuxuryCar(Location.DEFAULT);
			break;
			
			default:
				break;
		}
		return car;
	}
}
