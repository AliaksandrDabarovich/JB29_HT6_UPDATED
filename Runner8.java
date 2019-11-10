package by.ad.les09_8.main;
import by.ad.les09_8.bean.*;
import by.ad.les09_8.logic.*;
/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  Найти и вывести:  a) список покупателей в алфавитном порядке;  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 */

public class Runner8 {

	public static void main(String[] args) {
		int n;
		int m;
		n=4500;
		m=1000;
		
		Customer cust1 = new Customer(1, "Иванов Иван Иванович", "Минск. Пушкина 113", 4418, 22);
		Customer cust2 = new Customer(2, "Петрова Петр Петрович", "Гродно. Дзержинского 222", 1190, 3);
		Customer cust3 = new Customer(3, "Олегов Олег Олегович", "Брест. Ломоносова 1", 5689, 14);
		

		CustomerGroup customerlist1 = new CustomerGroup();
		

		customerlist1.setCustomer(cust1);
		customerlist1.setCustomer(cust2);
		customerlist1.setCustomer(cust3);
		System.out.println(customerlist1);

		CustomerListLogic log1=new CustomerListLogic();
		log1.compare(customerlist1);
				
		System.out.println("--------------------------------------");
		
		log1.getCustNum(n,m,customerlist1);
		  
		 
		 


	}
}


