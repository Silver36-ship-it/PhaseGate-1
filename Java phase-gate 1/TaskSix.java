import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){
int[] numbers  = {2,3,4,5,5,6,9};
int largest = numbers[0];
for(int index = 0; index < numbers.length; index++){
if(largest < numbers[index]){
	largest = numbers[index];}
}
System.out.println(largest);
}
}
