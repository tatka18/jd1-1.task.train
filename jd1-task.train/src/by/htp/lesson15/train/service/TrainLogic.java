package by.htp.lesson15.train.service;

import java.util.List;

import by.htp.lesson15.train.bean.Train;

public class TrainLogic {
	public Train findTrainByNumber(List<Train> trains, int trainNumber) {

		for (Train train : trains) {// Перебор всех элементов массива и коллекциии. в i элементе будет ссылка на
									// итый элемент коллекции Train

			if (train.getNumberOfTrain() == trainNumber) {
				return train;
			}
		}
		return null;

	}

	public void sortByNumber(List<Train> trains) { // < > передача коллекции

		for (int i = 0; i < trains.size() - 1; i++) {
			int minTrainNumber = trains.get(i).getNumberOfTrain();
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (minTrainNumber > currentTrain.getNumberOfTrain()) {
					minTrainNumber = currentTrain.getNumberOfTrain();
					minTrainNumberIndex = j;
				}

			}
			
			// запоминаем значение, адрес объекта Train
			Train temp1 = trains.get(i);	//поезд сейчас
			Train temp2 = trains.get(minTrainNumberIndex);	//Поезд с миниальным индексом
			
			// меняем поезда местами//меняем местами коллекции
			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);
			}
		

	}
	public void sortByStation(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {
			String nameOfStation = trains.get(i).getNameOfTown();
			int minNameOfStationIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				String nameOfStationNext = trains.get(j).getNameOfTown();

				if (nameOfStation.compareTo(nameOfStationNext) > 0) {
					nameOfStation = nameOfStationNext;
					minNameOfStationIndex = j;
				}

			}
			Train tr1 = trains.get(i);
			Train tr2 = trains.get(minNameOfStationIndex);

			trains.set(i, tr2);
			trains.set(minNameOfStationIndex, tr1);

		}

	}

}
