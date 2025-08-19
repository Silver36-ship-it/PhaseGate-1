import java.util.Scanner;
public class TaskNineteen{
public static void main(String[] args){
for(int index = 1; index <= 100; index++){
if(index % 3 == 0){
System.out.println("Fizz");
else if(index % 5 == 0){
System.out.println("Buzz")}
else if(index % 3 == 0 && index % 5 == 0){
System.out.println("FizzBuzz")}
}
}
}

