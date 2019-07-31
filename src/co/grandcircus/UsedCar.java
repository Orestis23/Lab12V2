package co.grandcircus;

public class UsedCar extends Car {

	private double mileage;

	// Maybe make a default constructor as well!

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		this.mileage = mileage; // FIXME this line does nothing

	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	// make: Ford model: Fiesta year: 1996 price: $20 (Used) mileage: 1 mile
	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + "]";
		
	}

}