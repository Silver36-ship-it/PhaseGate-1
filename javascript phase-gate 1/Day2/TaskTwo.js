function average_score(first_score,second_score,third_score){
	average_check = (first_score + second_score + third_score) / 3
	if(average_check >= 90 && average_check <= 100){
		return 'A'}
	else if(average_check >= 80 && average_check < 90){
		return 'B'}
	else if(average_check >= 70 && average_check < 80){
		return 'C'}
	else if(average_check >= 60 && average_check < 70){
		return 'D'}
	else if(average_check >= 0 && average_check < 60){
		return 'F'}
	else {
		return 'Invalid score'}
	}
	
	console.log(average_score(65,67,65))
	
