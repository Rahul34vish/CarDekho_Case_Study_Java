package com.jspiders.cardekho_case_study.entity;

public class Car {
	
	private  int car_Id;
	private  String car_Name;
	private  String car_Brand;
	private  String FuelType;
	private  double price;
	
//	public String toString() {
//		return "Car_Id"+getCar_Id()+", Name: "+getCar_Name();
//	}
	
	// Helper Methods for car_Id...........
	public int getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(int car_Id) {
		this.car_Id = car_Id;
	}
	
	// Helper Methods for car_Name...........
	public String getCar_Name() {
		return car_Name;
	}
	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}
	
	// Helper Methods for car_Brand...........
	public String getCar_Brand() {
		return car_Brand;
	}
	public void setCar_Brand(String car_Brand) {
		this.car_Brand = car_Brand;
	}
	
	// Helper Methods for fuleType...........
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	
	// Helper Methods for price...........
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
