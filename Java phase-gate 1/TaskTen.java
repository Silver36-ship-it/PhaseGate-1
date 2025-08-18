import java.util.Scanner;
public class TaskTen{
public static void main(String[] args){
int[] numbers  = {2,3,4,5,5,6,9};
int maximum = numbers[0];
int minimum = numbers[0];
for(int index = 0; index < numbers.length; index++){
	if(maximum < numbers[index]){
		maximum = numbers[index];}
	if(minimum > numbers[index]){
		minimum = numbers[index];}	
}
System.out.println("Maximum number is " + maximum);
System.out.println("Minimum number is " + minimum);
}
}

