package by.ad.les09_4.logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import by.ad.les09_4.bean.Train;

public class TrainLogic {
	public Train[] sortByPunkt(Train mas[]) {
		Train maxTrain;
		int maxTrainIndex;
		for (int i = 0; i < mas.length - 1; i++) {
			maxTrain = mas[i];
			maxTrainIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (maxTrain.getPunkt().compareTo(maxTrain.getPunkt()) > 0) {
					maxTrain = mas[j];
					maxTrainIndex = j;
				}
			}
			Train temp = mas[i];
			mas[i] = maxTrain;
			mas[maxTrainIndex] = temp;

		}
		return mas;
	}

	public void getInfo(Train mas[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер поезда >");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("Введите номер поезда >");
		}
		number = sc.nextInt();
		boolean boo;
		boo = false;
		for (int i = 0; i < mas.length; i++) {
			if (number == mas[i].getNum()) {
				System.out.println("Поезд: " + mas[i]);
				boo = true;
			}
		}
		if (boo == false) {
			System.out.println("Номера такого поезда нет!");
		}

	}

	public void sorting(Train mas[]) {
		Comparator<Train> tr = new Comparator<Train>() {
			public int compare(Train a, Train b) {

				int i = a.getPunkt().compareTo(b.getPunkt());
				if (i != 0) {
					return i;
				}

				if (a.getTime() > b.getTime()) {
					i = 1;

				} else if (a.getTime() < b.getTime()) {
					i = -1;

				}

				if (a.getMin() > b.getMin()) {
					i = 1;

				} else if (a.getMin() < b.getMin()) {
					i = -1;

				}
				return i;

			}

		};
		Arrays.sort(mas, tr);
		for (Train t : mas) {
			System.out.println(t);
		}
	}

	public static Train[] sort(Train mas[]) {
		Train maxTrain;
		int maxTrainIndex;
		for (int i = 0; i < mas.length - 1; i++) {
			maxTrain = mas[i];
			maxTrainIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (maxTrain.getNum() < mas[j].getNum()) {
					maxTrain = mas[j];
					maxTrainIndex = j;
				}
			}
			Train temp = mas[i];
			mas[i] = maxTrain;
			mas[maxTrainIndex] = temp;

		}
		return mas;
	}

}
