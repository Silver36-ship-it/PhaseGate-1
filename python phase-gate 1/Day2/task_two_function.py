def average_score(first_score,second_score,third_score):
	if type(first_score) == str or type(second_score) == str or type(third_score) == str:
		raise ValueError
	average_check = (first_score + second_score + third_score) / 3
	if 90 <= average_check <= 100:
		return 'A'
	elif 80 <= average_check < 90:
		return 'B'
	elif 70 <= average_check < 80:
		return 'C'
	elif 60 <= average_check < 70:
		return 'D'
	elif 0 <= average_check < 60:
		return 'F'
	else: 
		return 'Invalid score'
	