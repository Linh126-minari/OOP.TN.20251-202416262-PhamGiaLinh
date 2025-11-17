package com.hust.kstn.models;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	private static int nbDigitalVideoDiscs = 0;
	private String id;

	public DigitalVideoDisc(String title) {
		this.title=title;
	}
	public DigitalVideoDisc(String title, String category, double cost) {
		this(title);
		this.category=category;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category,String director, double cost) {
		this(title,category,cost);
		this.director=director;

	}
	public DigitalVideoDisc(String title, String category,String director, int length, double cost) {
		this(title,category,director,cost);
		this.length=length;
		this.id = DigitalVideoDisc.generateId();
		this.id = DigitalVideoDisc.generateId();

	}
	private static String generateId() {
		String id = String.format("%02d",nbDigitalVideoDiscs +1);
		nbDigitalVideoDiscs ++;
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "DVD" + "[" + this.id + "]"
				+ "[" + this.title + "]"
				+ "[" + this.cost + "]"
				+ "[" + this.director + "]"
				+ "[" + this.length + "]"
				+ "[" + this.category + "]";
	}

}
