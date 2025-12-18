package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.List;
import java.util.ArrayList;
public class BookTest {
	
	public static void main(String[] args) {
		
		List<BookAuthor> authors = new ArrayList<>();
		
		BookAuthor author1 = new BookAuthor("Nguyễn Nhật Ánh", 1955, "Nhà văn nổi tiếng của Việt Nam");
		
		BookAuthor author2 = new BookAuthor("J.K. Rowling", 1965, "Tác giả bộ truyện Harry Potter");
		
		authors.add(author1);
		
		Book book1 = new Book("Cho tôi xin một vé đi tuổi thơ", "Văn học", 120.0, 50,authors);
		
		System.out.println(book1);
		
		authors.add(author2);
		
		Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 150.0, 100, authors);
		
		System.out.println(book2);
	}
}
