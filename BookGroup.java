package by.ad.les09_9.bean;

import java.util.List;
import java.util.ArrayList;

public class BookGroup {
private List <Book> bookList;

public BookGroup(List <Book> bookList) {
	this.bookList=bookList;
}
public BookGroup() {
	bookList=new ArrayList <Book>();
}

public void addBook(Book book1) {
	bookList.add(book1);
}


public List<Book> getBookList() {
	return bookList;
}
public void setBookList(List<Book> bookList) {
	this.bookList = bookList;
}
@Override
public String toString() {
	return "BookList [bookList=" + bookList + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
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
	BookGroup other = (BookGroup) obj;
	if (bookList == null) {
		if (other.bookList != null)
			return false;
	} else if (!bookList.equals(other.bookList))
		return false;
	return true;
}


}

