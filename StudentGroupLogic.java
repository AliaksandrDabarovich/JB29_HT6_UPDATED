package by.ad.les09_3.logic;

import java.util.List;
import by.ad.les09_3.bean.Student;

public class StudentGroupLogic {
	public void find(List<Student> group2) {
		Student student;
		int[] marks;
		boolean boo;

		for (int i = 0; i < group2.size(); i++) {
			student = group2.get(i);
			marks = student.getMarks();
			boo = false;
			for (int j = 0; j < marks.length; j++) {
				if (marks[j] > 8) {
					boo = true;

				} else {
					boo = false;
					break;
				}
			}
			if (boo == true) {
				System.out.println("----------------------" + "\n" + student.getFio() + "\t" + student.getNumber());
			}

		}
	}
}
