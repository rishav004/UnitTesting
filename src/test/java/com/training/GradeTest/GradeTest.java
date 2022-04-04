package com.training.GradeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.test.Grade;

public class GradeTest {
	
	private Grade grade;
	
	@Test
	public void testGradeConditionMainIf() {
		grade = new Grade(-1);
		assertEquals(this.grade.checkGrade(), "Enter valid marks");
		grade = new Grade(0);
		assertEquals(this.grade.checkGrade(), "fail");
		grade = new Grade(101);
		assertEquals(this.grade.checkGrade(), "Enter valid marks");
		grade = new Grade(100);
		assertEquals(this.grade.checkGrade(), "A");
	}
	
	
	@Test
	public void testGradeCondition1() {
		grade = new Grade(90);
		assertEquals(this.grade.checkGrade(), "B");
		grade = new Grade(91);
		assertEquals(this.grade.checkGrade(), "A");
		grade = new Grade(99);
		assertEquals(this.grade.checkGrade(), "A");
		grade = new Grade(100);
		assertEquals(this.grade.checkGrade(), "A");
	}
	
	@Test
	public void testGradeCondition2() {
		grade = new Grade(80);
		assertEquals(this.grade.checkGrade(), "C");
		grade = new Grade(81);
		assertEquals(this.grade.checkGrade(), "B");
		grade = new Grade(89);
		assertEquals(this.grade.checkGrade(), "B");
		grade = new Grade(90);
		assertEquals(this.grade.checkGrade(), "B");
	}
	
	@Test
	public void testGradeCondition3() {
		grade = new Grade(70);
		assertEquals(this.grade.checkGrade(), "fail");
		grade = new Grade(71);
		assertEquals(this.grade.checkGrade(), "C");
		grade = new Grade(79);
		assertEquals(this.grade.checkGrade(), "C");
		grade = new Grade(80);
		assertEquals(this.grade.checkGrade(), "C");
	}
	
	@Test
	public void testGradeCondition4() {
		grade = new Grade(70);
		assertEquals(this.grade.checkGrade(), "fail");
		grade = new Grade(69);
		assertEquals(this.grade.checkGrade(), "fail");
		grade = new Grade(0);
		assertEquals(this.grade.checkGrade(), "fail");
	}

}
