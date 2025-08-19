public class TaskThree{
 public static String displayNamesThatLikesThis(String[] array){
int checkOtherLength = array.length - 2;
if(array.length == 0){
	return "No one likes this";
	}
if(array.length == 1){
	return array + " likes this";}
if(array.length == 2){
	return array[0] + " and " + array[1] + " likes this";
	}
if(array.length == 3){
	return array[0] + "," + array[1] + " and " + array[2] + " likes this";
	}
else
	return array[0] + "," + array[1] + " and " + checkOtherLength + " others likes this";
}
}