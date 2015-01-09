package com.maple.grade;

import java.io.IOException;
import java.util.Scanner;

/*프로그램을 실행시키는 main메소드가 있는 클래스
 - 총점과 평균학점도 출력해줍니다.(학생이 총5명이라고 가정.)*/

public class Main {

	public static void main(String[] args) {
		int[] g = { 0, 0, 0, 0, 0 };

		int i, sum = 0;
		Scanner input = new Scanner(System.in);
		Calculator obj = new Calculator();
		Printer prt = new Printer();

		re: while (true) {
			System.out.printf("*************************\n");
			System.out.printf("<성적의 범위는 1~100>\n");
			System.out.printf("5명의 성적을 입력하세요: ");
			for (i = 0; i < 5; i++) {
				g[i] = input.nextInt();
			}

			for (i = 0; i < 5; i++) {
				if (1 <= g[i] && g[i] <= 100) {
					// 올바른 값을 출력
					System.out.println("학생" + i + "의 학점은" + prt.print(g[i])
							+ "입니다.");

				} else {
					System.out.println("#re:올바른 학점 값의 범위가 아닙니다.\n다시 입력하세요.");

					continue re;
				}
			}
			// 총점과 평균학점 출력
			for (i = 0; i < 5; i++) {
				sum += g[i];
			}
			System.out.println("총점은" + sum + "의 평균학점은" + obj.grade(sum / 5)
					+ "입니다.");

		}

	}
}
