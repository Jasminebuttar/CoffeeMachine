package CoffeMachine;

import java.util.Scanner;

public class CoffeeMachine {
	static int water = 400;
	static int milk = 540;
	static int coffee = 120;
	static int cups = 9;
	static int money = 550;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String []args)
	{
		
		while(true){
	    System.out.println("Write action (buy, fill, take, remaining, exit):");
		String input = sc.next();
		
		if(input.equals("remaining")){
			print();
		}
		if(input.equals("buy")){
			buy();
		}
		if(input.equals("fill")){
			fill();
		}
		if(input.equals("take")){
			take();
		}
		if(input.equals("exit")){
			break;
		}
		
		}
	}
	
	public static void print(){
		System.out.print("The coffe machine has:\n" + water + " of water\n" + milk + " of milk\n" + 
						 coffee + " of coffee beans\n" + cups + " of disposable cups\n" + money + " of money\n");
	}
	
	public static void buy(){
//		For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
//		For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
//		And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
		
		try{
			System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
			int res = sc.nextInt();
			if(res==1 && water>=250 && cups>=1 && coffee>=16){
				water = water - 250;
				coffee = coffee - 16;
				money = money + 4;
				cups = cups - 1;
				System.out.println("I have enough resources, making you a coffee!");
			}
		
		
			else if(res==2 && water>=350 && cups>=1 && coffee>=20 && milk>=75){
				water = water - 350;
				milk = milk - 75;
				coffee = coffee - 20;
				money = money + 7;
				cups = cups - 1;
				System.out.println("I have enough resources, making you a coffee!");
			}

			else if(res==3 && water>=200 && cups>=1 && coffee>=12 && milk>=100){
				water = water - 200;
				milk = milk - 100;
				coffee = coffee - 12;
				money = money + 6;
				cups = cups - 1;
				System.out.println("I have enough resources, making you a coffee!");
			}
		
			else{
				System.out.println("Not eough resources to make coffee!");
				}
			}
			catch(Exception InputMismatchException){
			 return;
			}
	}
	
	public static void fill(){
		System.out.println("Write how many ml of water do you want to add:");
		int waterIn = sc.nextInt();	
		System.out.println("Write how many ml of milk do you want to add:");
		int milkIn = sc.nextInt();	
		System.out.println("Write how many grams of coffee beans do you want to add:");
		int coffeeIn = sc.nextInt();	
		System.out.println("Write how many disposable cups of coffee do you want to add:");
		int cupsIn = sc.nextInt();
		
		water = water + waterIn;
		milk = milk + milkIn;
		coffee = coffee + coffeeIn;
		cups = cups + cupsIn;
		
	}

	public static void take(){
		System.out.println("I gave you " + money + "\n");
		 money=0;
	}
	
	

}
