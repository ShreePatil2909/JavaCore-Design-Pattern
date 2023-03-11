package com.prowings.abstractfactory;

public class TestFactory {

	public static void main(String[] args) {

		Car sm = CarFactory.buildCar(CarType.SMALL, Location.ASIA);

		Car sd = CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT);

		Car sdn = CarFactory.buildCar(CarType.SEDAN, Location.USA);

		Car spo = CarFactory.buildCar(CarType.SPORTS, Location.DEFAULT);
	}

}
