package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public void addDVD(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBER_ORDERED) {
			itemsInCart[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("This disc has been added sucessfully");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		addDVD(disc1);
		addDVD(disc2);
	}
	public void addDVD(DigitalVideoDisc[] discs) {
		for(DigitalVideoDisc disc : discs) {
			addDVD(disc);
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		if(qtyOrdered==0) {
			System.out.println("The cart is empty");
		}
		if(qtyOrdered>0 && qtyOrdered<MAX_NUMBER_ORDERED) {
			boolean found = false;
			for(int i=0;i<qtyOrdered;i++) {
				if(itemsInCart[i].equals(disc)) {
					found = true;
					for(int j=i;j<qtyOrdered-1;j++) {
						itemsInCart[j] = itemsInCart[j+1];
					}
					itemsInCart[qtyOrdered-1] = null;
					qtyOrdered--;
					System.out.println("The disc has been removed sucessfully");
					break;
				}
			}
			if(!found) {
				System.out.println("The disc does not exist");
			}
		}
		
	}
	
	public double calculateTotalCost() {
		double totalCost = 0.0;
		for (int i=0;i<qtyOrdered;i++) {
			DigitalVideoDisc item = itemsInCart[i];
			totalCost += item.getCost();
		}
		return totalCost;
	}
	
	public void print() {
		System.out.println("======================== THE CURRENT CART ==================================");
		System.out.println("Total items: [" + qtyOrdered + "]");
		for(int i=0;i<qtyOrdered;i++) {
			DigitalVideoDisc item = itemsInCart[i];
			System.out.println(item.toString());
		}
		System.out.println("Subtotal: [" + calculateTotalCost() +"]$" );
		System.out.println("=============================================================================");
	}
}
