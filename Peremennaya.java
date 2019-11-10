package by.ad.les09_2.bean;

public class Peremennaya {
	private int a;
	private int b;

	public Peremennaya() {

	}

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

	public Peremennaya(int i, int j) {

		a = i;
		b = j;

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
		Peremennaya other = (Peremennaya) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

}
