package by.ad.les09_3.logic;

import java.util.Random;

public class StudentLogic {
	Random rand = new Random();

	public int[] generateMarks() {

		int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {

			marks[i] = rand.nextInt(10) + 1;
		}
		return marks;
	}

}
