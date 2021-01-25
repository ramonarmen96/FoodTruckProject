package com.skilldistillery.foodTruck;

import java.util.Scanner;
import com.skilldistillery.foodTruck.FoodTruck;

public class FoodTruckApp {

	FoodTruck[] foodTruckList = new FoodTruck[5];

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruckApp app = new FoodTruckApp();

		app.createFoodTruck(kb);

		app.menu(kb);

		kb.close();

	}

	private void createFoodTruck(Scanner kb) {

		for (int i = 0; i < 5; i++) {

			System.out.println("Please enter a Food Truck name: ");
			System.out.println("Or type in Quit to go to menu");

			String name = kb.nextLine();

			if (name.equals("Quit")) {
				break;
			}

			System.out.println("Please enter food type: ");
			String foodType = kb.nextLine();

			System.out.println("Please enter your rating for this food truck: ");
			double rate = kb.nextDouble();
			kb.nextLine();
			FoodTruck newFoodTruck = new FoodTruck(name, foodType, rate);
			this.foodTruckList[i] = newFoodTruck;

		}

	}

	private void menu(Scanner kb) {
		
		System.out.println(" _________________________________ ");
		System.out.println("|              MENU               |");
		System.out.println("|1. List all avaliable food trucks|");
		System.out.println("|2. See average rating            |");
		System.out.println("|3. See highest rated food truck  |");
		System.out.println("|4. Exit                          |");
		System.out.println("|_________________________________|");
		
		int input = kb.nextInt();
		
		switch (input) {
			case 1:
				for (int i = 0; i < foodTruckList.length; i++) {
					if(foodTruckList[i] == null) {
						break;
					}
					
					System.out.println(foodTruckList[i].toString());
				}
				menu(kb);
				break;
			case 2:
				double sum = 0.0;
				for (int i = 0; i < foodTruckList.length; i++) {
					if (foodTruckList[i] == null) {
						System.out.println(sum/i);
						break;
					}
					sum += foodTruckList[i].getRate();
				}
				menu(kb);
				break;
			case 3:
				FoodTruck high = foodTruckList[0];
				
				for (int i = 0; i < foodTruckList.length; i++) {
					if (foodTruckList[i] == null){
						System.out.println(high.toString());
						break;
					}
					if (high.getRate() < foodTruckList[i].getRate()) {
						high = foodTruckList[i];
					}
				}
				menu(kb);
				break;
			case 4:
				System.out.println("Goodbye");
				break;
		
		}
		
	}

}
