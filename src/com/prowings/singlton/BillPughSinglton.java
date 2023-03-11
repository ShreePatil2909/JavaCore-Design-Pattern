package com.prowings.singlton;

public class BillPughSinglton {

	private BillPughSinglton() {
		super();
	}

	private static class SingltonHelper {
		private static final BillPughSinglton obj = new BillPughSinglton();
	}

	public static BillPughSinglton getInstance() {
		return SingltonHelper.obj;
	}
}
