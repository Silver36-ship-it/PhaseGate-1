import java.util.Scanner;
public class TaskFourteen{
public static void main(String[] args){
int number = 5;
int factorial = 1;
for(int index = 1; index <= number; index++){
	factorial *= index;
}
System.out.println(factorial);
}
}