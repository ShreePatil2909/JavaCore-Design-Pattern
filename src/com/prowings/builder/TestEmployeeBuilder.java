package com.prowings.builder;

public class TestEmployeeBuilder {

	public static void main(String[] args) {

		Employee emp = new Employee.EmployeeBuilder()
				.FirstName("Shri")
				.LastName("PATIL")
				.address("KOP")
				.id(123)
				.build();

		System.out.println(emp);

		Employee emp1 = new Employee.EmployeeBuilder().id(101).build();

		System.out.println(emp1);
	}

}
