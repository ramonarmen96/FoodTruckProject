package com.skilldistillery.foodTruck;

public class FoodTruck {

	private String name;

	private String foodType;

	private double rate;

	private int idNum;

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rate=" + rate + ", idNum=" + idNum + "]";
	}

	private static int idCounter = 0;

	FoodTruck(String name, String foodType, double rate) {

		this.name = name;
		this.foodType = foodType;
		this.rate = rate;
		this.idNum = idCounter;
		FoodTruck.idCounter++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

}
