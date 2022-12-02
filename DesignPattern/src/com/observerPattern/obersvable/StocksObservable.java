package com.observerPattern.obersvable;

import com.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
	void add(NotificationAlertObserver observer);

	void remove(NotificationAlertObserver observer);

	void notifySubscribers();

	void setStockCount(int newStockAdd);

	int getStockCount();

}
