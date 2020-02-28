package main;

import java.util.List;

import bean.Train;
import service.TrainLogic;
import view.TrainConsoleInput;
import view.TrainView;
import view.UserInputInformation;

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
