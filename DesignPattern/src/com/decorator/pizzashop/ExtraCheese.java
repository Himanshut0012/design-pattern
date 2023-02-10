package com.decorator.pizzashop;

public class ExtraCheese extends ToppingDecorator{

	BasePizza pizza;
	
	public ExtraCheese(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+10;
	}

	

}
