package by.htp.lesson15.train.service;

import java.util.List;

import by.htp.lesson15.train.bean.Train;

public class TrainLogic {
	public Train findTrainByNumber(List<Train> trains, int trainNumber) {

		for (Train train : trains) {// ������� ���� ��������� ������� � ����������. � i �������� ����� ������ ��
									// ���� ������� ��������� Train

			if (train.getNumberOfTrain() == trainNumber) {
				return train;
			}
		}
		return null;

	}

	public void sortByNumber(List<Train> trains) { // < > �������� ���������

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
			
			// ���������� ��������, ����� ������� Train
			Train temp1 = trains.get(i);	//����� ������
			Train temp2 = trains.get(minTrainNumberIndex);	//����� � ���������� ��������
			
			// ������ ������ �������//������ ������� ���������
			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);
			}
		

	}
	public Train find(int trainNumber) {
		//stub
		return null;
	}

}
