package by.ad.les09_6.main;

import by.ad.les09_6.bean.Time;
import by.ad.les09_6.logic.TimeLogic;

/*
 * 6. Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения 
 * его отдельных полей (час, минута, секунда) с проверкой 
 * допустимости вводимых значений. В случае недопустимых 
 * значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Runner6 {

	public static void main(String[] args) {
		Time time1 = new Time();
		time1.setSec(11);
		time1.setMin(22);
		time1.setHour(-2);

		System.out.println(time1);

		TimeLogic timeLogic = new TimeLogic();
		timeLogic.setTime(10, 20, 30, time1);

		System.out.println(time1);

	}

}
