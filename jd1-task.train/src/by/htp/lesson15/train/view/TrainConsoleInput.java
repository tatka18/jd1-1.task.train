package by.htp.lesson15.train.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.lesson15.train.bean.Date;
import by.htp.lesson15.train.bean.Train;

public class TrainConsoleInput {
	
	public List<Train> create(){	//в этом методе спрятан процесс создания списка поездов
		List<Train> trains = new ArrayList<Train>();	//создан готовый объект-коллекция (безразмерный массив ArrayList)
	
	Train tr = new Train(123, "Minsk", new Date(2020,2,12,13,12));
	trains.add(tr);
	
	 tr = new Train(563, "Moscow", new Date(2020,2,12,22,25));
	trains.add(tr);
	
	tr = new Train(56, "Gorki", new Date(2020,3,12,17,11));
	trains.add(tr);
	
	tr = new Train(163, "Minsk", new Date(2020,1,12,19,28));
	trains.add(tr);
	
	tr = new Train(333, "Vilnus", new Date(2020,2,12,16,14));
	trains.add(tr);
	
	return trains;
	}
	
	public int inputTrain() {
		//stub
		return 123;
	}

}
