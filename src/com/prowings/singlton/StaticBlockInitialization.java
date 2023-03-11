package com.prowings.singlton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization obj;

	private StaticBlockInitialization() {
		super();
	}

	static {

		try {
			obj = new StaticBlockInitialization();
		} catch (Exception ex) {
			System.out.println("Exception occurred !!");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return obj;
	}

}

//Drawback : in this it is same like EagerInitialization 
//           just diffrence is we can handle exception using block