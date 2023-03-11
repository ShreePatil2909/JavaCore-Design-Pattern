package com.prowings.factory;

public class TestFactory {

	public static void main(String[] args) {

		Car sm = CarFactory.buildCar(CarType.SMALL);

		Car sd = CarFactory.buildCar(CarType.LUXURY);

		Car sdn = CarFactory.buildCar(CarType.SEDAN);

		Car spo = CarFactory.buildCar(CarType.SPORTS);
	}

}
