import java.util.Scanner;
public class Taskseven{
public static void main(String[] args){
int[] numbers  = {2,3,4,5,5,6,9};
int smallest = numbers[0];
for(int index = 0; index < numbers.length; index++){
if(smallest > numbers[index]){
	smallest = numbers[index];}
}
System.out.println(smallest);
}
}

