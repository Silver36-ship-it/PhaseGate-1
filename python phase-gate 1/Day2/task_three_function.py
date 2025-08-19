def display_names_that_likes_this(array_of_names):
	if array_of_names == "":
		raise ValueError
	if type(array_of_names) == int:
		raise ValueError 
	check_other_length = len(array_of_names) - 2
	if len(array_of_names) == 0:
		return 'No one likes this'
	if len(array_of_names) == 1:
		return array_of_names + ' likes this'
	if len(array_of_names) == 2:
		return array_of_names[0] + ' and ' + array_of_names[1] + ' likes this'
	if len(array_of_names) == 3:
		return array_of_names[0] + ',' + array_of_names[1] + ' and ' + array_of_names[2] + ' likes this'
	if len(array_of_names) > 3:
		return array_of_names[0] + ',' + array_of_names[1] + ' and ' + check_other_length + ' others likes this'
	