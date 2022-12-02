package com.prototype;

public class ProtoTypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs= new BookShop();
		bs.setShopName("PustKalay");
		bs.loadBooks();
		System.out.println("this is first output ______/ "+bs);
		
		
		
		BookShop bs1= bs.clone();
		bs.getBooks().remove(1);
		System.out.println("this is AFTER output ______/ "+bs);
		bs1.setShopName("Pustak Bhandar");
		
		System.out.println("this is second PS1 output ______/ "+bs1);
		
	}
}
