"""Since we are using 0 to remove cars and 1 to park cars,create array with 20 0's and crrate your remove and park functions"""	

new_parking_list = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
			
def parkCar():
	for car_index in range(len(new_parking_list)):
		if new_parking_list[car_index] == 0:
			new_parking_list[car_index]	= 1
	return 'Car parked!'
	
def leaveCarPark(car):
	if new_parking_list[car] == 1:
		new_parking_list[car] = 0
	return 'Car removed'
	
def displayCarStatus():
	print(new_parking_list)
	
def parkingLotDisplay():
	parkingDisplay = """
		Welcome to the Parking lot!!!
		1. Do you wish to park your car?
		2. Do you wish to leave the parking lot?
		3. Display the parking status
		4. To go back to your home
			"""
	print(parkingDisplay)


def main():
	while True:
		parkingLotDisplay()
		user_input = int(input("Choose an option: "))
		if user_input == 1: 
			car_to_park = int(input("Press 1 to park your car here: "))
			if car_to_park != 1:
				print("Invalid,Press 1 to park!")
			else:
				print(parkCar())
				print(displayCarStatus())
		elif user_input == 2:
			car_to_remove= int(input("Press 0 to remove your car here: "))
			if car_to_remove != 0:
				print("Not accessible, you can only remove cars here")
			else:
				print(leaveCarPark(car_to_remove))
				print(displayCarStatus())
		elif user_input == 3:
			print(displayCarStatus())
		elif user_input == 4:
			print("Thanks you,bye")
			break

		else:
			print("Invalid input")

main()
