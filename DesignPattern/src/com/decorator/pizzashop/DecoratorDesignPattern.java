package com.decorator.pizzashop;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		calculate cost for extra cheese + marghrita pizza
		BasePizza pizza = new ExtraCheese(new Marghenita());
		Integer marghExChe = pizza.cost();
		System.out.println("extra cheese + marghrita pizza : "+marghExChe);
		
		
//		now calculate cost for Marghrita + extra cheese + mushroom pizza
		BasePizza pizza1 = new Mushroom(new ExtraCheese(new Marghenita()));
		Integer mushMarghExChe = pizza1.cost();
		System.out.println("extra cheese + marghrita + mushroom  pizza : "+mushMarghExChe);

	}

}
