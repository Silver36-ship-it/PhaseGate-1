import java.util.Scanner;
public class DifferenceTwo{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double worldPopulation = 8.142e9;
 System.out.print("Enter the annual growth rate (in %): ");
    double growthRate = input.nextDouble();
double convert_rate = growthRate / 100;


 System.out.printf("\n%s %s %s\n", "Year", "Population", "Increase");
double increase = worldPopulation * convert_rate;
        for (int year = 1; year <= 75; year++) {
        increase = increase * year;
               System.out.printf("%-5d %-25.0f %-25.0f\n", year, worldPopulation, increase);
}
}
}