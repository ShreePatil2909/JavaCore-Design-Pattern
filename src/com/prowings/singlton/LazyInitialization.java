package com.prowings.singlton;

public class LazyInitialization {

	private static LazyInitialization instance;

	private LazyInitialization() {
		super();
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {

			instance = new LazyInitialization();
		}
		return instance;
	}

}

// Drawback : The preceding implementation works fine in the case of the single-threaded environment,
//			  but when it comes to multi-threaded systems, it can cause issues if multiple threads are
//			  inside the if condition at the same time. It will destroy the singleton pattern and 
//			  both threads will get different instances of the singleton class.