package com.observerPattern.observer;

import com.observerPattern.obersvable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
	
	private String mobileNumber;
	private StocksObservable observer;
	
	

	public MobileAlertObserver(String mobileNumber, StocksObservable observer) {
		this.mobileNumber = mobileNumber;
		this.observer = observer;
	}



	@Override
	public void update() {
		sendMsg(mobileNumber, "product is availbale right now..!");
	}



	private void sendMsg(String mobileNumber, String string) {
		System.out.println("msg sent to : "+mobileNumber+ "msg is :"+string);
	}

}
