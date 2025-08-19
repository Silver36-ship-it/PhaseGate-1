public class TaskFour{
public static String is_possiblePump(){
	int peak_value = 50;
	int check_pump = 25;
	if(check_pump * 2 == peak_value){
		return "True";}
	else
		return "False";
	}

public static void main(String[] args){
System.out.println(is_possiblePump());
}
}