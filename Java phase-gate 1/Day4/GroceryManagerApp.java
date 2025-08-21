import java.util.Scanner;
import java.util.ArrayList;
public class GroceryManagerApp{
 static ArrayList<String> listOfItems = new ArrayList<String>();

	public static String addGroceryItem(String item){
		listOfItems.add(item);
		return "Item added successfully";
		}
		
	public static String removeGroceryItem(String item){
		listOfItems.remove(item);
		return "Item removed successfully";
		}
        
      public static void showItems() {
        System.out.println(listOfItems);
		}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
	int menu;
	do {
		showMenuItem();
		
	System.out.println("Choose an option:");
	menu = input.nextInt();
	switch (menu){
	case 1: System.out.println("Add item here");
			String addItem = input.next();
			System.out.println(addGroceryItem(addItem));break;
	case 2: System.out.println("Remove item here");
		String removeItem = input.next();
		System.out.println(removeGroceryItem(removeItem));break;
	case 3: showItems();break;
	case 0: System.out.println("Thank you,bye!");break;
	default: System.out.println("Invalid input");break;}
	}while(menu != 0);	
	}
	
	public static void showMenuItem() {
	String items = """
	1. Add item
	2. Remove item
	3. Show an item
	0. Exit
		""";
	System.out.println(items);
		}
		
		}
	
	
	
	
	
	
	