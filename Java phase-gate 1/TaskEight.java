import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){
int[] numbers  = {2,3,4,5,5,6,9};
int sum = 0;
for(int index = 0; index < numbers.length; index++){
	sum += numbers[index];
}
System.out.println(sum);
}
}

