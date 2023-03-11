package com.prowings.singlton;

public class TestSinglton {

	public static void main(String[] args) {

		EagerInitialization obj1 = EagerInitialization.getInstance();
		EagerInitialization obj2 = EagerInitialization.getInstance();

//		System.out.println(obj1 == obj2);

		StaticBlockInitialization ob1 = StaticBlockInitialization.getInstance();
		StaticBlockInitialization ob2 = StaticBlockInitialization.getInstance();

//		System.out.println(ob1 == ob2);

		LazyInitialization instance = LazyInitialization.getInstance();
		LazyInitialization instance1 = LazyInitialization.getInstance();
		LazyInitialization instance2 = LazyInitialization.getInstance();

//		System.out.println(instance == instance1);

		ThreadSafeSinglton safe = ThreadSafeSinglton.getInstance();
		ThreadSafeSinglton safe1 = ThreadSafeSinglton.getInstance();

//		System.out.println(safe == safe1);

		ThreadSafeDoubleCheck check = ThreadSafeDoubleCheck.getInstance();
		ThreadSafeDoubleCheck check1 = ThreadSafeDoubleCheck.getInstance();

//		System.out.println(check == check1);

		BillPughSinglton bill1 = BillPughSinglton.getInstance();
		BillPughSinglton bill2 = BillPughSinglton.getInstance();

//		System.out.println(bill1 == bill2);

		EnumSinglton enm = EnumSinglton.getInstance();
		EnumSinglton enm1 = EnumSinglton.getInstance();

//		System.out.println(enm == enm1);

		SerializationSinglton single = SerializationSinglton.getInstance();
		SerializationSinglton single1 = SerializationSinglton.getInstance();

		System.out.println(single == single1);
	}

}
