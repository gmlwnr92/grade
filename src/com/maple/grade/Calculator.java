package com.maple.grade;

/*학점계산을 수행하는 클래스
 * 
 * 
 <설명>
 - 1~100사이의 점수를 입력받아서 학점을 출력해주면됩니다.
 1~20
 20~40
 40~60
 60~80
 80~100
 (학점등급은 A, B, C, D, F 5가지로만 하겠습니다.)

 - 예로 98을 입력할 경우 A라고 출력해주면 Ok


 */
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
