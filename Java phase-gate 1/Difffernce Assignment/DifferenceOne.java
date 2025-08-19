import java.util.Scanner;
public class DifferenceOne{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter 4 digit number: ");
int user_input = input.nextInt();

if(user_input < 1000 || user_input > 9999){
System.out.println("Invalid input");
}
int digit1 = user_input / 1000;
int digit2 = (user_input / 100) % 10;
int digit3 = (user_input / 10) % 10;
int digit4 = user_input % 10;

int add_seven = 7;
digit1 = digit1 + add_seven;
digit2 = digit2 + add_seven;
digit3 = digit3 + add_seven;
digit4 = digit4 + add_seven;

digit1 = digit1 % 10;
digit2 = digit2 % 10;
digit3 = digit3 % 10;
digit4 = digit4 % 10;

int temp = digit1;
digit1 = digit3;
digit3 = temp;

int temp2 = digit2;
digit2 = digit3;
digit3 = temp2;

System.out.printf("Encrypted password %d%d%d%d", digit1,digit2,digit3,digit4);
}
}