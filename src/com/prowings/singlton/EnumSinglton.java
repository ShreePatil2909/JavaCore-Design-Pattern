package com.prowings.singlton;

public enum EnumSinglton {

	INSTANCE;

	public static EnumSinglton getInstance() {
		return INSTANCE;
	}
}
