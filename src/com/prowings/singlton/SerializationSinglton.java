package com.prowings.singlton;

import java.io.Serializable;

public class SerializationSinglton implements Serializable {

	private static final long serialVersionUID = -8395969021057656091L;

	private SerializationSinglton() {

	}

	private static class SingltonHelper {
		private static final SerializationSinglton instance = new SerializationSinglton();

	}

	public static SerializationSinglton getInstance() {
		return SingltonHelper.instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
