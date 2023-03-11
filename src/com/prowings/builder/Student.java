package com.prowings.builder;

import lombok.ToString;

@ToString
public class Student {

	String FirstName;
	String LastName;
	int roll;
	String address;
	long mobileNumber;
	int marks;

	public Student(StudentBuilder builder) {
		super();
		FirstName = builder.FirstName;
		LastName = builder.LastName;
		this.roll = builder.roll;
		this.address = builder.address;
		this.mobileNumber = builder.mobileNumber;
		this.marks = builder.marks;
	}

	public static class StudentBuilder {

		String FirstName;
		String LastName;
		int roll;
		String address;
		long mobileNumber;
		int marks;

		public StudentBuilder(String FirstName, String LastName) {
			super();
			this.FirstName = FirstName;
			this.LastName = LastName;
		}

		public StudentBuilder roll(int roll) {
			this.roll = roll;
			return this;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder mobileNumber(long mobileNo) {
			this.mobileNumber = mobileNo;
			return this;
		}

		public StudentBuilder marks(int marks) {
			this.marks = marks;
			return this;
		}

		public Student build() {
			Student student = new Student(this);
			return student;
		}

		@Override
		public String toString() {
			return "StudentBuilder [FirstName=" + FirstName + ", LastName=" + LastName + ", roll=" + roll + ", address="
					+ address + ", mobileNumber=" + mobileNumber + ", marks=" + marks + "]";
		}
	}
}
