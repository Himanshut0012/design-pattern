package com.decorator.pizzashop;

public class Mushroom extends ToppingDecorator{

	BasePizza pizza;
	
	public Mushroom(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+15;
	}

}
