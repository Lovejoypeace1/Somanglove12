package com.javalevel2;

public class StudentInformation {
	String firstName;
	String lastName;
	String grade;
	String gender;
	int id;
	int age;
	
	public StudentInformation (String firstName, String lastName, String grade, String gender, int id, int age){
	     this.firstName = firstName;
	     this.lastName = lastName;
	     this.grade = grade;
	     this.gender = gender;
	     this.id =id;
		 this.age = age;
		}
	
	public static void main(String[] args) {
		StudentInformation student = new StudentInformation(null, null, null, null, 0, 0);
		student.firstName = "Suresh";
		student.lastName = "Gurung";		
	    student.grade = "Master"; 
	    student.gender = "male";
	    student.id=10;
	    student.age= 30;
	    
	    System.out.println(student.firstName);
	    System.out.println(student.lastName);
	    System.out.println(student.grade);
	    System.out.println(student.gender);
	    System.out.println(student.id);
	    System.out.println(student.age);

		}

}
