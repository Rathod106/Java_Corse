import java.util.Scanner;
class Vehicle {
	    String brand;
	    String model;
	    int year;

	    // Constructor to initialize brand, model, and year
	    public Vehicle(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    // Method to drive
	    public void drive() {
	        System.out.println(brand + " " + model + " is driving.");
	    }
	}

	
	class Car extends Vehicle {
	    String color;

	    // Constructor to initialize all attributes
	    public Car(String brand, String model, int year, String color) {
	        super(brand, model, year); // Call the parent constructor
	        this.color = color;
	    }

	    // Method to honk
	    public void honk() {
	        System.out.println(color + " " + brand + " " + model + " is honking!");
	    }
	}

	public class Inheritance2{
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        Car car1 = new Car("BMW", "X5", 2023, "Black");
	        Car car2 = new Car("Tesla", "Model S", 2022, "White");
	        Car car3 = new Car("Honda", "Civic", 2021, "Blue");
	    

	        // Call methods for each car
	        car1.drive();
	        car1.honk();

	        car2.drive();
	        car2.honk();

	        car3.drive();
	        car3.honk();
	}
	}
 */Output
BMW X5 is driving.
Black BMW X5 is honking!
Tesla Model S is driving.
White Tesla Model S is honking!
Honda Civic is driving.
Blue Honda Civic is honking!
*/