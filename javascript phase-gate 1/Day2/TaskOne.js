function age_check(father_age,son_age){
	if(father_age == 0 || son_age == 0){
		return 'Invalid age'}
	calc_age = son_age + son_age - father_age
	return Math.abs(calc_age)
}	
console.log(age_check(0,18))