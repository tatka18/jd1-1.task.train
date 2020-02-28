package by.htp.lesson15.train.view;

import java.util.List;
import java.util.Scanner;

import by.htp.lesson15.train.bean.Train;

public class UserInputInformation {

	public int trainInfo(List<Train> trains) {

		Scanner sc = new Scanner(System.in);
		String message = "Введите номер поезда>> ";

		int number;

		System.out.println(message);

		number = scan(sc, message);

		if (checkOut(trains, number) == false) {
			while (checkOut(trains, number) == false) {

				System.out.println(
						"Поезда, согласно введенным вами данным, не существует\nПопробуйте еще раз, либо обратитесь в справочную службу "
								+ "для получения дополнительной информации");
				System.out.println();

				if (exitContinue(sc) == true) {
					System.out.println(message);

				} else {
					System.out.println("Спасибо, что пользуетесь нашими услугами!");
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

	public int scan(Scanner sc, String message) { // метод для исключения ситуации ввода пользователем некорректных
													// данных

		while (sc.hasNextInt() == false) {

			String str = sc.next();

			System.out.println("Вы ввели " + str
					+ ", что является некорректным вводом. Необходимо ввести НОМЕР поезда. Попробуйте еще раз\n>>");
		}

		return sc.nextInt();

	}

	public boolean checkOut(List<Train> trains, int x) { // проверка на наличие номера поезда, запрашиваемого
															// пользователем

		for (Train train : trains) {

			if (x == train.getNumberOfTrain()) {
				return true;
			}
		}
		return false;

	}

	public boolean exitContinue(Scanner sc) { // выход из поиска/продолжить поиск
		int x;
		System.out.println("Нажмите 1 чтобы продолжить\nНажмите 0 чтобы выйти");

		x = sc.nextInt();

		while (x != 0 && x != 1) {
			System.out.println("Нажмите 1 чтобы продолжить\nНажмите 0 чтобы выйти");
			x = sc.nextInt();
		}

		if (x == 0) {
			return false;
		} else {
			return true;
		}

	}

}
