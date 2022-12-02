package com.observerPattern.observer;

import com.observerPattern.obersvable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

	private String emailId;
	private StocksObservable observable;

	public EmailAlertObserver(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(emailId, "product is availble right now!!");
	}

	private void sendMail(String emailId, String string) {
		System.out.println("Mail sent to : " + emailId + "msg is : " + string);
	}

}
