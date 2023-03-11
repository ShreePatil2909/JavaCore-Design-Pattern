package com.prowings.factory;

public class SportsCar extends Car {

	public SportsCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Sports car Constructing !!");
	}

}
