package by.htp.lesson15.train.view;

import java.util.List;

import by.htp.lesson15.train.bean.Train;

public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: " + train.getNumberOfTrain() + "\n\t" + train.getNameOfTown() + "\n");

	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}

	public void printInfo(List<Train> trains, int trainInfo) { // вывод информации о поезде на консоль

		for (Train train : trains) {

			if (train.getNumberOfTrain() == trainInfo) {
				System.out.println("Поезд номер " + train.getNumberOfTrain() + ", следующий до станции "
						+ train.getNameOfTown() + ", отправляется: " + train.getDate());
			}

		}
	}

	public void printSortByStation(List<Train> trains) {	//вывод отсортированных по имени станции на консоль
		System.out.println("------------------------------------\nSorting by station:\n");

		for (Train train : trains) {
			System.out.println("TRAIN: " + train.getNameOfTown() + "\n\tномер " + train.getNumberOfTrain() + " отправляется "
					+ train.getDate());
		}
	}
}
