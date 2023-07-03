package com.jspiders.cardekho_case_study.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.Car;

@SuppressWarnings("static-access")
public class CarOperation {
	Scanner sc = new Scanner(System.in);
	//this is the main array list where all the cars will that are stored will be present
	ArrayList<Car> allCars = new ArrayList<Car>();   
	Car car = new Car(); // created global Car class object
	
	// this method is to display all the cars that are present 
	public void allCarDetails(){
		if(allCars.isEmpty()== true) {
			System.out.println("No Cars are Present!!!");
		}
		else {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
			System.out.println("----------------------------------------------------------------------------\n");
			for(Car c : allCars) {
				System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
				+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
			}
		}
	}
	
	// this method is to add the car into the ArrayList(allCars)
	public void addNewCar() {
		System.out.println("How many cars do you want to add?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			Car newCars = new Car();
			System.out.print("Enter Car_Id:");
			newCars.setCar_Id(sc.nextInt());
			System.out.print("Enter Car_Name:");
			newCars.setCar_Name(sc.next());
			System.out.print("Enter Car_Brand:");
			newCars.setCar_Brand(sc.next());
			System.out.print("Enter FuelType:");
			newCars.setFuelType(sc.next());
			System.out.print("Enter Car Price:");
			newCars.setPrice(sc.nextDouble());
			allCars.add(newCars);	
			System.out.println("\n"+newCars.getCar_Name()+"  Added!!\n");
		}
		allCarDetails();
	}
	
	//this method is to search the ArrayList(allCars)and find the fields whose car_Id is same as user input
	public void searchById() {
		// this is local ArrayList to print only the searched result by car_Id
		ArrayList<Car> searchId = new ArrayList<Car>();
		System.out.println("Enter Car_Id: ");
		int id = sc.nextInt();
		for(Car c : allCars) {
			if(id == c.getCar_Id()){
				searchId.add(c);
			}	
		}
		System.out.println("\nSearch Results are ... ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : searchId) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
	
	//this method is to search the ArrayList(allCars)and find the fields whose car_Name is same as user input
	public void searchByName() {
		// this is local ArrayList to print only the searched result by car_Name
		ArrayList<Car> searchName = new ArrayList<Car>();
		System.out.println("Enter Car_Name: ");
		String name = sc.next();
		for(Car c : allCars) {
			if(c.getCar_Name().equalsIgnoreCase(name)) {
				searchName.add(c);
			}
		}
		System.out.println("\nSearch Results are ... ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : searchName) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
	
	//this method is to search the ArrayList(allCars)and find the fields whose car_Brand is same as user input
	public void searchByBrand() {
		// this is local ArrayList to print only the searched result by car_Brand
		ArrayList<Car> searchBrand = new ArrayList<Car>();
		System.out.println("Enter Car_Brand: ");
		String brand = sc.next();
		for(Car c : allCars) {
			if(c.getCar_Brand().equalsIgnoreCase(brand)) {
				searchBrand.add(c);
			}
		}
		System.out.println("\nSearch Results are ... ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : searchBrand) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
	
	//this method is to search the ArrayList(allCars)and find the fields whose fuelType is same as user input
	public void searchByFuelType() {
		// this is local ArrayList to print only the searched result by fuelType
		ArrayList<Car> searchFuel = new ArrayList<Car>();
		System.out.println("Enter FuelType: ");
		String fuelType = sc.next();
		for(Car c : allCars) {
			if(c.getFuelType().equalsIgnoreCase(fuelType)) {
				searchFuel.add(c);
			}
		}
		System.out.println("\nSearch Results are ... ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : searchFuel) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
	
	// this method is to update the fields of the car by its car_Id
	public void updateCar() {
		System.out.println("Enter Car_Id to be updated");
		int id = sc.nextInt();
		for(Car c : allCars) {
			if(id == c.getCar_Id()) {
				System.out.print("Enter new Car_Name:");
				c.setCar_Name(sc.next());
				System.out.print("Enter new Car_Brand:");
				c.setCar_Brand(sc.next());
				System.out.print("Enter new FuelType:");
				c.setFuelType(sc.next());
				System.out.print("Enter new Price:");
				c.setPrice(sc.nextInt());
				System.out.print("\nCar is Updated !!!\n");
			}
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : allCars) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
	
	// this method is to delete the fields of the car by its car_Id
	public void deleteCar() {

		System.out.println("Enter Car_Id to be deleted");
		int id = sc.nextInt();
		for(int i=0;i<allCars.size();i++) {
			Car car = allCars.get(i);
			if(car.getCar_Id()== id) {
				allCars.remove(i);
			}
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Car_Id"+"  Car_Name"+"  Car_Brand"+"  FuelType"+"  Price");
		System.out.println("----------------------------------------------------------------------------\n");
		for(Car c : allCars) {
			System.out.println(c.getCar_Id()+"   "+c.getCar_Name()
			+"   "+c.getCar_Brand()+"   "+c.getFuelType()+"    "+c.getPrice());
		}
	}
}
