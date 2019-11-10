package by.ad.les09_3.bean;

import java.util.Arrays;

public class Student {
	private String fio;
	private int groupNumber;
	private int[] marks = new int[5];

	public Student(String fio, int groupNumber, int[] marks) {

		this.fio = fio;
		this.groupNumber = groupNumber;
		this.marks = marks;

	}

	public int[] getMarks() {
		return marks;

	}

	public String getFio() {
		return fio;

	}

	public int getNumber() {
		return groupNumber;

	}

	@Override
	public String toString() {
		return "Student [fio=" + fio + ", groupNumber=" + groupNumber + ", marks=" + Arrays.toString(marks) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fio == null) ? 0 : fio.hashCode());
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(marks);
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
		Student other = (Student) obj;
		if (fio == null) {
			if (other.fio != null)
				return false;
		} else if (!fio.equals(other.fio))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		return true;
	}

}
