package com.hust.kstn.models;

public class Store {
	private static final int MAX_NUMBER_STORED = 100;
	private int qtyStored = 0;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBER_STORED];
	
	public void addDVD(DigitalVideoDisc disc) {
		if(qtyStored<MAX_NUMBER_STORED) {
			itemsInStore[qtyStored]=disc;
			qtyStored++;
			System.out.println("This disc has been added to store sucessfully");
		}
		else {
			System.out.println("The store is almost full");
		}
	
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if(qtyStored==0) {
			System.out.println("The store is empty");
		}
		if(qtyStored>0 && qtyStored<MAX_NUMBER_STORED) {
			boolean found = false;
			for(int i=0;i<qtyStored;i++) {
				if(itemsInStore[i].equals(disc)) {
					found = true;
					for(int j=i;j<qtyStored-1;j++) {
						itemsInStore[j] = itemsInStore[j+1];
					}
					itemsInStore[qtyStored-1] = null;
					qtyStored--;
					System.out.println("The disc has been removed from store sucessfully");
					break;
				}
			}
			if(!found) {
				System.out.println("The disc does not exist");
			}
		}
	}
}
