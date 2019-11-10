package by.ad.les09_9.logic;

import java.util.Collections;
import java.util.List;

import by.ad.les09_9.bean.*;

public class BookListLogic {
	
	public void sort (List<Book> bookList2) {
		Collections.sort(bookList2);
		for(Book boo : bookList2) {
			System.out.println(boo);
		}
	}
	
	
	public void author(List<Book> bookList2, String author) {
		for(Book boo : bookList2) {
			if (boo.getAuthor()==author) {
				System.out.println(boo);
			}
		}
		
		
	}
	
	public void publisher(List<Book> bookList2, String publisher) {
		for(Book boo : bookList2) {
			if (boo.getPublisher()==publisher) {
				System.out.println(boo);
			}
		}
		
		
	}
	public void year(List<Book> bookList2, int year) {
		for(Book boo : bookList2) {
			if (boo.getYear()>year) {
				System.out.println(boo);
			}
		}
		
		
	}
	
	
	
	
	
	
}
