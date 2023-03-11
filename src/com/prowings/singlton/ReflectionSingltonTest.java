package com.prowings.singlton;

import java.lang.reflect.Constructor;

public class ReflectionSingltonTest {

	public static void main(String[] args) {

		EagerInitialization one = new EagerInitialization();
		EagerInitialization two = null;

		try {
			Constructor[] constructor = EagerInitialization.class.getDeclaredConstructors();

			for (Constructor con : constructor) {
				con.setAccessible(true);

				two = (EagerInitialization) con.newInstance();
				break;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(one == two);

	}

}
