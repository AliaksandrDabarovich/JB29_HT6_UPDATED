package by.ad.les09_9.main;

import java.util.Collections;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString().
 *  Создать второй класс, агрегирующий массив типа Book, с подходящими 
 *  конструкторами и методами. Задать критерии выбора данных и вывести 
 *  эти данные на консоль.  Book: id, название, автор(ы), издательство, 
 *  год издания, количество страниц, цена, тип переплета.  Найти и вывести: 
 *   a) список книг заданного автора;  
 *   b) список книг, выпущенных заданным издательством; 
 *    c) список книг, выпущенных после заданного года.
 */
import java.util.List;

import by.ad.les09_9.bean.Book;
import by.ad.les09_9.bean.BookGroup;
import by.ad.les09_9.logic.*;

import java.util.ArrayList;
import java.util.Collections;

public class Runner9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book(1, "Водяной", "Митчел", "Глобо. Москва",
				2011, 650, 45, "мягкий");
		Book book2=new Book(2, "Криминальный район", "Иванов", "Питер",
				2019, 200, 22, "твёрдый");
		Book book3=new Book(2, "Атава", "Петров", "Питер",
				2017, 110, 34, "мягкий");
		
		BookGroup bookGroup=new BookGroup ();
		List <Book> bookList2=bookGroup.getBookList();
		bookGroup.addBook(book1);
		bookGroup.addBook(book2);
		bookGroup.addBook(book3);
		System.out.println(bookGroup);
		System.out.println("------------------------------------");
		BookListLogic log1=new BookListLogic();
		log1.author(bookList2, "Иванов");
		System.out.println("------------------------------------");
		log1.publisher(bookList2, "Питер");
		System.out.println("------------------------------------");
		log1.year(bookList2, 2017);
		
	}

}
