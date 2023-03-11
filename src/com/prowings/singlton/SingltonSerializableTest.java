package com.prowings.singlton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingltonSerializableTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializationSinglton one = SerializationSinglton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.txt"));

		out.writeObject(one);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("abc.txt"));
		SerializationSinglton two = (SerializationSinglton) in.readObject();
		in.close();

		System.out.println(one.hashCode());
		System.out.println(two.hashCode());

	}

}
