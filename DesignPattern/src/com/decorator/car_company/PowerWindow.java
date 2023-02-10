package com.decorator.car_company;

public class PowerWindow extends PunchBaseCar{
	
PunchBaseCar punch;
	
	public PowerWindow(PunchBaseCar punch) {
		super();
		this.punch = punch;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return punch.price()+25000;
	}

}
