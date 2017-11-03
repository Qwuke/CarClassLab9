/*
 * @author Tristan Mortimer
 * 
 *
 * 
 */

package net.qwuke;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valid = "y"; // String for validating whether or not to continue based on y or n
		System.out.println("Welcome to the Grand Circus Motors admin console");

		while (valid.equalsIgnoreCase("y")) {

			//code
			System.out.println();
			int runs = Validator.getInt(sc, "How many cars do you want to input into the inventory system? \n",0,Integer.MAX_VALUE);
			CarApp inventory = new CarApp();
			//loop the numbers
			while(runs != 0) {
				//User input
				System.out.println("Okay let's make a fresh car entry");
				String make = Validator.getString(sc, "What make is this car? ");
				String model = Validator.getString(sc, "What model is this car? ");
				int year = Validator.getInt(sc, "What year this car was made? ", 1900, 2030);
				double price = Validator.getDouble(sc, "What is the price of this car? ");
				//pass into cars
				Car car = new Car(make,model,year,price);
				//Add this new car object
				inventory.addCar(car);
				System.out.println("This entry was added!");
				--runs;//decrement
			}
			System.out.println();
			System.out.println("Here's all the cars in our inventory");
			inventory.printCars();
			System.out.println();

			//Continue 'y or n' validation 
			System.out.println("Continue? Type y to continue or n to end the program");
			valid = sc.nextLine();
			while (!(valid.equalsIgnoreCase("y") || valid.equalsIgnoreCase("n"))) {
				System.out.println("That wasn't a valid input! Type y to continue or n to stop");
				valid = sc.nextLine();
			}
			
		} // If y rerun the program, if n close scanner
		sc.close();
	}

}
