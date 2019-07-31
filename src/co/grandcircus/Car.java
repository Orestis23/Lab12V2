package co.grandcircus;

import java.util.Scanner;  // Need to import the scanner, but don't need to initialize it.

public class Car {

	private String make;					// This is an instance variable
	private String model;					// This is an instance variable
	int year;								// This is an instance variable
	double price;							// This is an instance variable
	
	public Car() {
		Car kiarasWhip = new Car();
		
	}
	
	public Car(String make, String model, int year, double price) {  // this is my constructor
		super();
		this.make = make;           // these are the variables that i made my instance variables and want to assign values to.
		this.model = model; 		// these are the variables that i made my instance variables and want to assign values to.
		this.year = year; 			// these are the variables that i made my instance variables and want to assign values to.
		this.price = price; 		// these are the variables that i made my instance variables and want to assign values to.
	}

	public String getMake() {		// these are my getters and setters
		return make;
	}

	public void setMake(String make) { // these are my getters and setters
		this.make = make;
	}

	public String getModel() { // these are my getters and setters
		return model;
	}

	public void setModel(String model) { // these are my getters and setters
		this.model = model;
	}

	public int getYear() { // these are my getters and setters
		return year;
	}

	public void setYear(int year) { // these are my getters and setters
		this.year = year;
	}

	public double getPrice() { // these are my getters and setters
		return price;
	}

	public void setPrice(double price) { // these are my getters and setters
		this.price = price;
	}

	@Override
	public String toString() {			// this is the 'toString' method that I created to return a formated string with car details.
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	
	}
	

