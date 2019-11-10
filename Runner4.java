package by.ad.les09_4.main;
/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность 
 * сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, 
 * номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, 
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 
 */
import by.ad.les09_4.bean.Train;
import by.ad.les09_4.logic.TrainLogic;

public class Runner4 {

	public static void main(String[] args) {
		Train mas[] = new Train[5];
		Train tr1 = new Train("Brest", 23, 9, 01);
		Train tr2 = new Train("Brest", 11, 9, 02);
		Train tr3 = new Train("Vitebsk", 5, 14, 15);
		Train tr4 = new Train("Lodz", 9, 12, 16);
		Train tr5 = new Train("Smolevichi", 78, 22, 59);

		mas[0] = tr1;
		mas[1] = tr2;
		mas[2] = tr3;
		mas[3] = tr4;
		mas[4] = tr5;
		
		TrainLogic trainLogic=new TrainLogic();
		trainLogic.sorting(mas);
		
	}
}
