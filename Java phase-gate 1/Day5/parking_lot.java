import java.util.Scanner;
import java.util.ArrayList;
public class parking_lot{
 static int[] parking_slot_list = new int [20];
			
public static String parkCar(int car){
	parking_slot_list.add(car);
	return "Car parked!";}
	
public static String leaveCarPark(int car){
	parking_slot_list.remove(car);
	return "Car removed";}
	
public static String displayCarStatus(){
	System.out.println(parking_slot_list);
	}


public static void main(String [] args){
Scanner input = new Scanner(System.in);
	int menu;
	do{
		parkingLotDisplay();
	System.out.println("Choose an option:");
	menu = input.nextInt();
	switch(menu){
		case 1: System.out.println("Press 1 to park your car here: ");
				int car_to_park = input.nextInt();
				if(car_to_park != 1){
				System.out.println("Invalid,Press 1 to park!");}
				else
				System.out.println(parkCar(car_to_park));
				System.out.println(displayCarStatus());break;
		case 2:
				System.out.println("Press 0 to remove your car here: ");
				int car_to_remove = input.nextInt();
				if(car_to_remove != 0){
				System.out.println("Not accessible, you can only remove cars here");}
				else
				System.out.println(leaveCarPark(car_to_remove));
				System.out.println(displayCarStatus());break;
		case 3:
				System.out.println(displayCarStatus());break;
		case 4:
				System.out.println("Thanks you,bye");break;

		default: 	System.out.println("Invalid input");
				}
		}while(menu != 4);
		}

public static String parkingLotDisplay(){
		String parkingDisplay = """
		Welcome to the Parking lot!!!
		1. Do you wish to park your car?
		2. Do you wish to leave the parking lot?
		3. Display the parking status
		4. To go back to your home
			""";
			System.out.println(parkingDisplay);}
			}
