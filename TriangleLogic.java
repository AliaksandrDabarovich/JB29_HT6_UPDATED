package by.ad.les09_7.logic;

import by.ad.les09_7.bean.Triangle;

public class TriangleLogic {
	public void setSide(int a, int b, int c, Triangle triangle) {
		if (a < b + c && a > b - c && b < a + c && b > a - c && c < a + b && c > a - b) {
			triangle.setA(a);
			triangle.setB(b);
			triangle.setC(c);

		} else {
			triangle.setA(0);
			triangle.setB(0);
			triangle.setC(0);
		}
	}

	public void countPerimeter(Triangle triangle) {
		int per;
		per = triangle.getA() + triangle.getB() + triangle.getC();
		System.out.println(per);
	}

	public void countSquare(Triangle triangle) {
		int polper;
		double squre;
		polper = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
		squre = Math
				.sqrt(polper * (polper - triangle.getA()) * (polper - triangle.getB()) * (polper - triangle.getC()));
		System.out.println(squre);
	}

	public void countMediana(Triangle triangle) {
		int a;
		int b;
		int c;

		double med;
		double toch;

		a = triangle.getA();
		b = triangle.getB();
		c = triangle.getC();

		med = 0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a);
		toch = med / 3 * 2;
		System.out.println("Точка пересечения медиан находится от вершин А на расстоянии: " + toch);
	}
}
