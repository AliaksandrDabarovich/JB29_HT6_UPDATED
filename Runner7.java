package by.ad.les09_7.main;

import by.ad.les09_7.bean.Triangle;
import by.ad.les09_7.logic.TriangleLogic;

/*
 * 7. Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class Runner7 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle);
		TriangleLogic triangleLogic = new TriangleLogic();
		triangleLogic.countMediana(triangle);

	}

}
