package com.maple.grade;

import java.io.IOException;
import java.util.Scanner;

/*���α׷��� �����Ű�� main�޼ҵ尡 �ִ� Ŭ����
 - ������ ��������� ������ݴϴ�.(�л��� ��5���̶�� ����.)*/

public class Main {

	public static void main(String[] args) {
		int[] g = { 0, 0, 0, 0, 0 };

		int i, sum = 0;
		Scanner input = new Scanner(System.in);
		Calculator obj = new Calculator();
		Printer prt = new Printer();

		re: while (true) {
			System.out.printf("*************************\n");
			System.out.printf("<������ ������ 1~100>\n");
			System.out.printf("5���� ������ �Է��ϼ���: ");
			for (i = 0; i < 5; i++) {
				g[i] = input.nextInt();
			}

			for (i = 0; i < 5; i++) {
				if (1 <= g[i] && g[i] <= 100) {
					// �ùٸ� ���� ���
					System.out.println("�л�" + i + "�� ������" + prt.print(g[i])
							+ "�Դϴ�.");

				} else {
					System.out.println("#re:�ùٸ� ���� ���� ������ �ƴմϴ�.\n�ٽ� �Է��ϼ���.");

					continue re;
				}
			}
			// ������ ������� ���
			for (i = 0; i < 5; i++) {
				sum += g[i];
			}
			System.out.println("������" + sum + "�� ���������" + obj.grade(sum / 5)
					+ "�Դϴ�.");

		}

	}
}
