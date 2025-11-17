package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book {
	private String id;
	private static int nbBooks = 0;
	private String title;
	private String category;
	private double cost;
	private int numOfTokens;
	private List<BookAuthor> authors = new ArrayList<>();
	private static String generateId() {
		String id = String.format("%02d",nbBooks +1);
		nbBooks ++;
		return id;
	}
	
	public Book(String title,String category, double cost, int numOfTokens) {
		this.id = Book.generateId();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.numOfTokens = numOfTokens;
	}
	
	public Book(String title,String category, double cost, int numOfTokens,List<BookAuthor> authors ) {
		this(title,category,cost,numOfTokens);
		this.authors = authors;
	}
	
	public void addAuthor(BookAuthor author) {
		if(!authors.contains(author)) {
			authors.add(author);
		}
	}
	
	public void removeAuthor(BookAuthor author) {
		if(authors.contains(author)) {
			authors.remove(author);
		}
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public double getCost() {
		return cost;
	}

	public int getNumOfTokens() {
		return numOfTokens;
	}

	public List<BookAuthor> getAuthors() {
		return authors;
	}
	
	@Override
	public String toString() {
	 return "Book[" + this.id + "][" 
	 + this.title + "][" 
	 + this.cost + "][" 
	 + this.category + "]["
	 + this.numOfTokens + "]"
	 + "\nAuthors: " + this.authors;
	}
}


