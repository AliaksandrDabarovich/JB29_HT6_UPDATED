package by.ad.les09_7.bean;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		if (a < b + c && a > b - c && b < a + c && b > a - c && c < a + b && c > a - b) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			System.out.println("Стороны не могут быть с такими значениями. Они приравнены к 0");
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}
	}

	public Triangle() {

	}
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		return true;
	}
	

}
