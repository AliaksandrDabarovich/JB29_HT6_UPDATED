package by.ad.les09_5.main;

import by.ad.les09_5.bean.Counter;
import by.ad.les09_5.logic.CounterLogic;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который 
 * может увеличивать или уменьшать свое значение на единицу 
 * в заданном диапазоне. Предусмотрите инициализацию счетчика 
 * значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и 
 * метод позволяющее получить его текущее состояние.
 *  Написать код, демонстрирующий все возможности класса.
 */
public class Runner5 {

	public static void main(String[] args) {
		Counter Counter1 = new Counter();
		Counter Counter2 = new Counter(15);

		System.out.println("Counter1: " + Counter1);
		System.out.println("Counter2: " + Counter2);

		CounterLogic counterLogic = new CounterLogic();

		Counter1.setVar(counterLogic.add(Counter1.getVar()));
		Counter2.setVar(counterLogic.rem(Counter2.getVar()));

		System.out.println(Counter1.getVar());
		System.out.println(Counter2.getVar());

	}

}
