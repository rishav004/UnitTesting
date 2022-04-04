package com.training.test;

public class Grade {

	private int marks;
	private String grade;

	public Grade(int marks) {
		super();
		this.marks = marks;
	}

	public String checkGrade() {
		if (this.marks < 0 || this.marks > 100) {
			return "Enter valid marks";
		} else {
			if (this.marks > 90 && this.marks <= 100)
				this.grade = "A";
			else if (this.marks > 80 && this.marks <= 90)
				this.grade = "B";
			else if (this.marks > 70 && this.marks <= 80)
				this.grade = "C";
			else
				this.grade = "fail";
			return this.grade;
		}

	}

}
