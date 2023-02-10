package com.decorator.car_company;

public class DecoratorCarCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		calculate price for petrol + ac punch car
		PunchBaseCar punch = new ACFunctionality(new PunchPetrolCar());
		System.out.println("price for petrol + ac punch car : "+ punch.price());
		
//		calculate price for diesel + ac punch car + power window
		PunchBaseCar punch1 = new PowerWindow(new ACFunctionality(new PunchDieselCar()));
		System.out.println("price for diesel + ac + power window punch car : "+ punch1.price());
	}

}
