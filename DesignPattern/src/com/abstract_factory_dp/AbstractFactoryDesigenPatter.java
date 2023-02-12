package com.abstract_factory_dp;

import com.abstract_factory_dp.enums.CarType;

public class AbstractFactoryDesigenPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.MICRO));
		System.out.println(CarFactory.buildCar(CarType.MINI));
	}

}
