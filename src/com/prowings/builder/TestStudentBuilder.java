package com.prowings.builder;

public class TestStudentBuilder {

	public static void main(String[] args) {

		Student std=new Student.StudentBuilder("Shree", "Patil")
				    .mobileNumber(937346096)
				    .build();
		
		System.out.println(std);
		
		Student std1=new Student.StudentBuilder("Krishna", "Mathura").roll(10).build();	
		
		System.out.println(std1);
	}

}
