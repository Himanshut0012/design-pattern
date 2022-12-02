package com.observerPattern;

import com.observerPattern.obersvable.IphoneObservableImpl;
import com.observerPattern.obersvable.StocksObservable;
import com.observerPattern.observer.EmailAlertObserver;
import com.observerPattern.observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		StocksObservable iphoneOservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1= new EmailAlertObserver("Ram@gamil.com", iphoneOservable);
		NotificationAlertObserver observer2= new EmailAlertObserver("Sita@gamil.com", iphoneOservable);
		NotificationAlertObserver observer3= new EmailAlertObserver("Mahadev@gamil.com", iphoneOservable);
		
		iphoneOservable.add(observer1);
		iphoneOservable.add(observer2);
		iphoneOservable.add(observer3);
		
		iphoneOservable.setStockCount(10);
	}

}
