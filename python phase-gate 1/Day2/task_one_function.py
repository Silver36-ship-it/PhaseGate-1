import math

def age_check(father_age,son_age):
	if type(father_age) == str or type(son_age) == str:
		raise ValueError
	if father_age <= 0 or son_age <= 0:
		raise ValueError
	if type(father_age) == float or type(son_age) == float:
		raise ValueError
	calc_age = son_age + son_age - father_age
	return math.fabs(calc_age)
