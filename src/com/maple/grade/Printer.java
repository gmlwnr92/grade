package com.maple.grade;

/*������ ������ ����ϴ� Ŭ����*/
public class Printer {

	char print(int s) {
		char h;
		Calculator obj = new Calculator();

		h = obj.grade(s);
		return h;
	}

}