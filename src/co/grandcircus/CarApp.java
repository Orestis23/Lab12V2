package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		double price;
		String make;
		String model;

		// Car kiarasWhip = new Car(null, null, 0, 0);

		System.out.println("How many cars would you like to enter?");
		int numCars = scan.nextInt();

		scan.nextLine();
		Car[] carsArray = new Car[numCars];
		ArrayList<Car> Car = new ArrayList<>();

		for (int i = 0; i < carsArray.length; i++) {

			System.out.println("What is the make of your vehicle?");
			make = scan.nextLine();
			System.out.println("What is the model of your vehicle?");
			model = scan.nextLine();
			System.out.println("What is the year of your vehicle?");
			year = scan.nextInt();
			scan.nextLine();
			System.out.println("How much does the car cost?");
			price = scan.nextDouble();
			scan.nextLine();
			Car c = new Car(make, model, year, price);
			Car.add(c);

		}

		for (Car car : carsArray) {
			System.out.println(car);
		}

		System.out.println("Which number car are you interested in?");

	}
}
