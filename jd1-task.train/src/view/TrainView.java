package view;

import java.util.List;

import bean.Train;

public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: " + train.getNumberOfTrain() + "\n\t" + train.getNameOfTown() + "\n");

	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}

	public void printInfo(List<Train> trains, int trainInfo) { // ����� ���������� � ������ �� �������

		for (Train train : trains) {

			if (train.getNumberOfTrain() == trainInfo) {
				System.out.println("����� ����� " + train.getNumberOfTrain() + ", ��������� �� ������� "
						+ train.getNameOfTown() + ", ������������: " + train.getDate());

			}

		}
	}

}
