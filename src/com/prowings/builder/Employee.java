package com.prowings.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {

	String FirstName;
	String LastName;
	int id;
	String address;
	int pin;
	long mobileNumber;
}
