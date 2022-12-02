package com.observerPattern.obersvable;

import java.util.ArrayList;
import java.util.List;

import com.observerPattern.observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable {

	private List<NotificationAlertObserver> observerList = new ArrayList<>();
	private int stockCount;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for (NotificationAlertObserver obj : observerList) {
			obj.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdd) {
		if (stockCount == 0) {
			notifySubscribers();
		}
		stockCount += newStockAdd;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
