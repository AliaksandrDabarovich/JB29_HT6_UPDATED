package by.ad.les09_2.main;

import by.ad.les09_2.bean.Peremennaya;

/*
 * 2. Создйте класс Test2 двумя переменными. 
 * Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса. 
 
 */
public class Runner2 {

	public static void main(String[] args) {

		Peremennaya ob1 = new Peremennaya();
		Peremennaya ob2 = new Peremennaya(5, 7);

		System.out.println("Переменная а по умолчанию " + ob1.getA());
		System.out.println("Переменная b по умолчанию " + ob1.getB());
		System.out.println("Переменная а " + ob2.getA());
		System.out.println("Переменная b " + ob2.getB());
	}
}
