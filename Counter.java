package by.ad.les09_5.bean;

public class Counter {
	private int var;

	public Counter(int var) {
		this.var = var;
	}

	public Counter() {
		var = 0;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return "Count [var=" + var + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + var;
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
		Counter other = (Counter) obj;
		if (var != other.var)
			return false;
		return true;
	}
	

}
