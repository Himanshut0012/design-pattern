package com.decorator.car_company;

public class ACFunctionality extends PunchDecorat {

	PunchBaseCar punch;
	
	public ACFunctionality(PunchBaseCar punch) {
		super();
		this.punch = punch;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return punch.price()+50000;
	}

}
