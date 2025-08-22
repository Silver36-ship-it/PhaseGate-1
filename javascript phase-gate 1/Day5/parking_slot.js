var prompt = require('prompt-sync')();
parking_slot_list = []
function parkingLotDisplay(){
		parkingDisplay = `
		Welcome to the Parking lot!!!
		1. Do you wish to park your car?
		2. Do you wish to leave the parking lot?
		3. Display the parking status
		4. To go back to your home
			`;
			console.log(parkingDisplay)}
			
function parkCar(car){
	parking_slot_list.push(car)
	return "Car parked!"}
	
function leaveCarPark(car){
	parking_slot_list.push(car)
	return "Car removed"}
	
function displayCarStatus(){
	return parking_slot_list
	}
	
	while(true){
		parkingLotDisplay();
	var user_input = prompt("Enter option: ");
		let count = 0
		count++
	if(user_input == 1){
		var car_to_park = prompt("Press 1 to park your car here: ")
			if(car_to_park != 1){
				console.log("Invalid,Press 1 to park!")}
			else
				console.log(parkCar(car_to_park))
				console.log(displayCarStatus())}
	else if(user_input == 2){
		var car_to_remove = prompt("Press 0 to remove your car here: ")
			if(car_to_remove != 0){
				console.log("Not accessible, you can only remove cars here")}
			else
				console.log(leaveCarPark(car_to_remove))
				console.log(displayCarStatus())}
	else if(user_input == 3){
		console.log(displayCarStatus())}
	else if(user_input == 4){
		console.log("Thanks you,bye")
		break}
	else
		console.log("Invalid input")
		}