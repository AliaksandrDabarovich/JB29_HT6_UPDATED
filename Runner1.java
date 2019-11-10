package by.ad.les09_1.main;

import by.ad.les09_1.bean.Variable;
import by.ad.les09_1.logic.VariableLogic;

/*
 * 1. Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму значений 
 * этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
 */
public class Runner1 {

	public static void main(String[] args) {
		Variable variable1 = new Variable();

		variable1.setA(5);
		variable1.setB(7);

		VariableLogic variableLogic = new VariableLogic();

		variableLogic.print("Переменная а", variable1.getA());
		variableLogic.print("Переменная b", variable1.getB());
		variableLogic.print("Сумма", variableLogic.summarize(variable1.getA(), variable1.getB()));
		variableLogic.compare(variable1.getA(), variable1.getB());

	}

}
