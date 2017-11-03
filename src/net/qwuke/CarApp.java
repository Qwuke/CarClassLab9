/*
 * @author Tristan Mortimer
 * 
 *
 * 
 */

package net.qwuke;

import java.util.ArrayList;

public class CarApp {
	private ArrayList<Car> cars;
	//Table input, and output/print formatting
	public CarApp(){
		this.cars = new ArrayList<Car>();
		
	};
	public CarApp(int carCount){
		this.cars = new ArrayList<Car>(carCount);
	};
	
	public void addCar(Car car){
		this.cars.add(car);
	}
	public ArrayList<Car> getInventory(){
		return this.cars;
	}
	
	public void printCars() {
		System.out.printf("%-20s %-20s %-20s %20s\n", "Make", "Model", "Year", "Price");
		for (Car inventory : this.cars) {
			System.out.println(inventory.toString());
		}
	}

}
