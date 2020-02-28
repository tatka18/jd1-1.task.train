package by.htp.lesson15.train.main;

import java.util.List;

import by.htp.lesson15.train.bean.Train;
import by.htp.lesson15.train.service.TrainLogic;
import by.htp.lesson15.train.view.TrainConsoleInput;
import by.htp.lesson15.train.view.TrainView;
import by.htp.lesson15.train.view.UserInputInformation;

public class Main {

	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		TrainLogic logic = new TrainLogic();

		List<Train> trains; // ������ �������
		trains = input.create(); // ����������� input ������ �������

		logic.sortByNumber(trains);

		view.print(trains);

		UserInputInformation scan = new UserInputInformation();

		int trainInfo = scan.trainInfo(trains); // ������ ������ ������ �� ������������
		view.printInfo(trains, trainInfo);

	}

}
