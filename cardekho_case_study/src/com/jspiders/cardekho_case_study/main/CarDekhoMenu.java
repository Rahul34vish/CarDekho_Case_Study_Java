package com.jspiders.cardekho_case_study.main;

import com.jspiders.cardekho_case_study.operation.CarOperation;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;
public class CarDekhoMenu {
	
	// created private object of CarOperation class and global made it global by declaring outside
	// so that we can use methods of CarOperation class throughout this CarDekhoMenu class.
	private static  CarOperation operation = new CarOperation();
	
	// created one loop variable and initialize it as true and put it in the while loop in the main method  
	// that means until this variable will not get false this application will not end
	private static boolean loop = true;
	public static void main(String[] args) {
		
		while(loop) {
			carDekhoMenu(); //this method will run until loop = false
		}
	} 
	
	// Method to be displaying the options or features of the application that can be used by user 
	public static void carDekhoMenu() {
		
		// all the Menu options will be display by this print statement
		System.out.println("\n=====================MENU=======================\n");
		System.out.println("1. Add Car Details"
				           +"\n2. Search Car Details"
				           +"\n3. Update Car Details"
				           +"\n4. Delete Car Details"
				           +"\n5. Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your Choice: ");
		int choice = sc.nextInt();  // input for menu option selection
		switch (choice) {  // this switch is for above options (Main Switch)
		case 1:
			// all the options after clicking Add car details will be display by this print statement
			System.out.println("================ADD================="
					           +"\n1. Add New Car"
					           +"\n2. Go Back to Menu");
			System.out.println("\nEnter your Choice: ");
			int choice1 = sc.nextInt();  // input for options of add car details option
			switch (choice1) {  // this nested switch is for options of add car details options 
			case 1:
				operation.addNewCar();
				break;

			case 2:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("Invalid Choice Enter correct choice...");
				break;
			}
			break;

		case 2:
			// all the options after clicking Search car details will be display by this print statement
			System.out.println("==================SEARCH=================="
					           +"\n1. Search Car by car_Id"
					           +"\n2. Search Car by car_Name"
					           +"\n3. Search Car by car_Brand"
					           +"\n4. Search Car by fuelType"
					           +"\n5. Display All Cars Details"
					           +"\n6. Go Back to Menu");
			System.out.println("\nEnter your Choice: ");
			int choice2 = sc.nextInt();  // input for options of search car details option
			switch (choice2) {  // this nested switch is for options of search car details options 
			case 1:
				operation.searchById();
				break;

			case 2:
				operation.searchByName();
				break;
				
			case 3:
				operation.searchByBrand();
				break;
				
			case 4:
				operation.searchByFuelType();
				break;
				
			case 5:
				operation.allCarDetails();
				break;
				
			case 6:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("Invalid Choice Enter correct choice...");
				break;
			}
			break;
		
		case 3:
			// all the options after clicking Update car details will be display by this print statement
			System.out.println("================UPDATE================="
			                   +"\n1. Update a Car"
			                   +"\n2. Go Back to Menu");
			System.out.println("\nEnter your Choice: ");
			int choice3 = sc.nextInt();  // input for options of update car details option
			switch (choice3) {  // this nested switch is for options of update car details options 
			case 1:
				operation.updateCar();
				break;

			case 2:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("Invalid Choice Enter correct choice...");
				break;
			}
			break;
			
		case 4:
			// all the options after clicking Delete car details will be display by this print statement
			System.out.println("================DELETE================="
			                    +"\n1. Delete a Car"
			                    +"\n2. Go Back to Menu");
			System.out.println("\nEnter your Choice: ");
			int choice4 = sc.nextInt();  // input for options of delete car details option
			switch (choice4) {  // this nested switch is for options of delete car details options 
			case 1:
				operation.deleteCar();
				break;

			case 2:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("Invalid Choice Enter correct choice...");
				break;
			}
			break;
			
		case 5:
			System.out.println("THANKYOU !!!!!");
			System.out.println("Application has Ended......");
			loop = false;
			break;
			
		default:
			System.out.println("Invalid Choice Enter correct choice...");
			break;
		}
	}
}
