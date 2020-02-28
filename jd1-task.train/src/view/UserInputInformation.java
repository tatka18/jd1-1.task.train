package view;

import java.util.List;
import java.util.Scanner;

import bean.Train;

public class UserInputInformation {

	public int trainInfo(List<Train> trains) {

		Scanner sc = new Scanner(System.in);
		String message = "������� ����� ������>> ";

		int number;

		System.out.println(message);

		number = scan(sc, message);

		if (checkOut(trains, number) == false) {
			while (checkOut(trains, number) == false) {

				System.out.println(
						"������, �������� ��������� ���� ������, �� ����������\n���������� ��� ���, ���� ���������� � ���������� ������ "
								+ "��� ��������� �������������� ����������");
				System.out.println();

				if (exitContinue(sc) == true) {
					System.out.println(message);

				} else {
					System.out.println("�������, ��� ����������� ������ ��������!");
					break;
				}
				number = scan(sc, message);
				checkOut(trains, number);
			}

			if (checkOut(trains, number) == true) {
				return number;
			}

		}
		return number;

	}

	public int scan(Scanner sc, String message) { // ����� ��� ���������� �������� ����� ������������� ������������
													// ������

		while (sc.hasNextInt() == false) {

			String str = sc.next();

			System.out.println("�� ����� " + str
					+ ", ��� �������� ������������ ������. ���������� ������ ����� ������. ���������� ��� ���\n>>");
		}

		return sc.nextInt();

	}

	public boolean checkOut(List<Train> trains, int x) { // �������� �� ������� ������ ������, ��������������
															// �������������

		for (Train train : trains) {

			if (x == train.getNumberOfTrain()) {
				return true;
			}
		}
		return false;

	}

	public boolean exitContinue(Scanner sc) { // ����� �� ������/���������� �����
		int x;
		System.out.println("������� 1 ����� ����������\n������� 0 ����� �����");

		x = sc.nextInt();

		while (x != 0 && x != 1) {
			System.out.println("������� 1 ����� ����������\n������� 0 ����� �����");
			x = sc.nextInt();
		}

		if (x == 0) {
			return false;
		} else {
			return true;
		}

	}

}
