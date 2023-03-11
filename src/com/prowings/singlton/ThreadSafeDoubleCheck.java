package com.prowings.singlton;

public class ThreadSafeDoubleCheck {

	private static ThreadSafeDoubleCheck obj;

	private ThreadSafeDoubleCheck() {
		super();

	}

	public static ThreadSafeDoubleCheck getInstance() {

		if (obj == null) {

			synchronized (ThreadSafeDoubleCheck.class) {
				if (obj == null) {
					obj = new ThreadSafeDoubleCheck();
				}

			}
		}
			return obj;
	}

}
