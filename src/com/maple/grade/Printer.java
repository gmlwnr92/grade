package com.maple.grade;

/*구해진 학점을 출력하는 클래스*/
public class Printer {

	char print(int s) {
		char h;
		Calculator obj = new Calculator();

		h = obj.grade(s);
		return h;
	}

}