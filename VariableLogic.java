package by.ad.les09_1.logic;

public class VariableLogic {

	public void print(String message, int var) {
		System.out.println(message + " : " + var);
	}

	public int summarize(int a, int b) {
		return a + b;

	}

	public void compare(int a, int b) {
		if (a > b) {
			System.out.println("Большее a");
		} else if (b > a) {
			System.out.println("Большее b");
		} else {
			System.out.println("Переменные равны");
		}
	}
}
