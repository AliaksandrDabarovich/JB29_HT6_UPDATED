package by.ad.les09_3.main;

import java.util.ArrayList;
import java.util.List;

import by.ad.les09_3.bean.Student;
import by.ad.les09_3.bean.StudentGroup;
import by.ad.les09_3.logic.StudentGroupLogic;
import by.ad.les09_3.logic.StudentLogic;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и 
 * инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. Добавьте возможность 
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */
public class Runner3 {

	public static void main(String[] args) {
		StudentLogic studentLogic = new StudentLogic();

		Student st1 = new Student("Dabarovich", 11, studentLogic.generateMarks());
		Student st2 = new Student("Dabarovich2", 22, studentLogic.generateMarks());
		Student st3 = new Student("Dabarovich3", 33, studentLogic.generateMarks());
		Student st4 = new Student("Dabarovich4", 44, studentLogic.generateMarks());
		Student st5 = new Student("Dabarovich5", 55, studentLogic.generateMarks());
		Student st6 = new Student("Dabarovich6", 11, studentLogic.generateMarks());
		Student st7 = new Student("Dabarovich7", 22, studentLogic.generateMarks());
		Student st8 = new Student("Dabarovich8", 33, studentLogic.generateMarks());
		Student st9 = new Student("Dabarovich9", 44, studentLogic.generateMarks());
		Student st10 = new Student("Dabarovich10", 55, studentLogic.generateMarks());
		StudentGroup group1 = new StudentGroup();
		List<Student> group2 = new <Student>ArrayList();
		group2 = group1.getSt();

		group1.add(st1);
		group1.add(st2);
		group1.add(st3);
		group1.add(st4);
		group1.add(st5);
		group1.add(st6);
		group1.add(st7);
		group1.add(st8);
		group1.add(st9);
		group1.add(st10);

		System.out.println(group1);
		StudentGroupLogic studentGroupLogic = new StudentGroupLogic();
		studentGroupLogic.find(group2);

		/*
		 * List <Student> group2 = new ArrayList<>(); group2 = group1.getSt();
		 * otlich(group2);
		 */

	}

}
