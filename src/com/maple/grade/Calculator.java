package com.maple.grade;


public class Calculator {

	char grade(int i) {

		int grade = i;
		char ch_grade = 0;

		if (1 <= grade && grade < 20) {

			ch_grade = 'F';
			return ch_grade;

		} else if (20 <= grade && grade < 40) {

			ch_grade = 'D';
			return ch_grade;

		} else if (40 <= grade && grade < 60) {

			ch_grade = 'C';
			return ch_grade;

		} else if (60 <= grade && grade < 80) {

			ch_grade = 'B';
			return ch_grade;

		} else if (80 <= grade && grade < 100) {

			ch_grade = 'A';
			return ch_grade;

		}
		return ch_grade;

	}

}
