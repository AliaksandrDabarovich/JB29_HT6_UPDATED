package by.ad.les09_1.bean;

public class Variable {
	private int a;
	private int b;

	public void setA(int i) {
		a = i;
	}

	public void setB(int j) {
		b = j;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		Variable other = (Variable) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

}
