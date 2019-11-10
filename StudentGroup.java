package by.ad.les09_3.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
	private List<Student> stList;

	public StudentGroup() {
		stList = new ArrayList<Student>();
	}

	public void add(Student newSt) {
		stList.add(newSt);
	}

	public List<Student> getSt() {
		return stList;
	}

	@Override
	public String toString() {
		return "StudentGroup [stList=" + stList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stList == null) ? 0 : stList.hashCode());
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
		StudentGroup other = (StudentGroup) obj;
		if (stList == null) {
			if (other.stList != null)
				return false;
		} else if (!stList.equals(other.stList))
			return false;
		return true;
	}

	

}
