package com.hust.kstn.test;

import com.hust.kstn.models.*;
public class CartTest {
		
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc[] dvd = new DigitalVideoDisc[18];
		for(int i=0;i<18;i++) {
			dvd[i] = new DigitalVideoDisc("Title"+i, "Category"+i,"Director"+i,i+70,20.0f+i);
			
		}
		cart.removeDVD(dvd[0]);
		cart.addDVD(dvd);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spider-Man", "Science Fiction", "Sam Raimi", 82, 24.95);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars II", "Science Fiction", "George Lucas", 89, 24.95);
		cart.addDVD(dvd1, dvd2);
		cart.addDVD(dvd3);
		cart.removeDVD(dvd4);
		cart.print();
	}
}
