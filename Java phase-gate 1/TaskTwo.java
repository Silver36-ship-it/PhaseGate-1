import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number:");
int first_number = input.nextInt();
System.out.println("Enter a number:");
int second_number = input.nextInt();
System.out.println("Enter a number:");
int third_number = input.nextInt();
int largest = first_number;
int smallest = first_number;
if(largest < second_number) largest = second_number;
if(largest < third_number) largest = third_number;
System.out.println("Largest is " + largest);

if(smallest > second_number) smallest = second_number;
if(smallest > third_number) smallest = third_number;
System.out.println("Smallest is " + smallest);
int sum = first_number + second_number + third_number;
int average = sum/3;
int product = first_number * second_number * third_number;
System.out.println("Sum is " + sum);
System.out.println("Average is " + average);
System.out.println("Product is " + product);
}
}
