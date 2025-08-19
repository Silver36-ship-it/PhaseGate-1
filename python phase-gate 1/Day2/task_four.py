def is_possiblePump():
	peak_value = 50
	check_pump = 25
	if check_pump * 2 == peak_value:
		return "True"
	else:
		return "False"

def main():

	print(is_possiblePump())


main()
