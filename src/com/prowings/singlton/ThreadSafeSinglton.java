package com.prowings.singlton;

public class ThreadSafeSinglton {

	private static ThreadSafeSinglton instance;

	private ThreadSafeSinglton() {
		super();
	}

	public static synchronized ThreadSafeSinglton getInstance() {

		if (instance == null) {

			instance = new ThreadSafeSinglton();
		}
		return instance;
	}

}
//Drawbacks : A simple way to create a thread-safe singleton class is to make the global access
//			  method synchronized so that only one thread can execute this method at a time