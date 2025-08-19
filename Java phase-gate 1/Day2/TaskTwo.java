public class TaskTwo{
public static char checkAgeDifference(int firstScore,int secondScore,int thirdScore){
	int averageCheck = (firstScore + secondScore + thirdScore) / 3;
	if(averageCheck >= 90 && averageCheck <= 100){
		return 'A';}
	else if(averageCheck >= 80 && averageCheck < 90){
		return 'B';}
	else if(averageCheck >= 70 && averageCheck < 80){
		return 'C';}
	else if(averageCheck >= 60 && averageCheck < 70){
		return 'D';}
	else
		return 'F';
		}
		}