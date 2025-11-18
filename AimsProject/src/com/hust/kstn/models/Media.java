package com.hust.kstn.models;

public class Media {
	private String id;
	private static int nbMedias=0;
	private String title;
	private String category;
	private double cost;
	
	private static String generateId() {
		String id = String.format("%02d", nbMedias);
		nbMedias ++;
		return id;
	}
	public Media(String title, double cost, String category) {
		this.id = Media.generateId();
		this.title= title;
		this.category = category;
		this.cost = cost;
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
	@Override
	public String toString() {
	 return "Media" + "[" + this.id + "]"
	 + "[" + this.title + "]"
	 + "[" + this.cost + "]"
	 + "[" + this.category + "]";
	}
}
