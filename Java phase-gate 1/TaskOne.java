import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number:");
int number = input.nextInt();
System.out.println("Enter a number:");
int number2 = input.nextInt();
int square = number * number;
int square2 = number2 * number2;
int add_both = square + square2;
int diffrence = square - square2;

System.out.println(square);
System.out.println(square2);
System.out.println("Addition of both is " + add_both);
System.out.println("Substarction of both is " + diffrence);

}
}
