/*Since we are using 0 to remove cars and 1 to park cars,create array with 20 0's and crrate your remove and park functions*/

var prompt = require('prompt-sync')();
parking_slot_list = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
function parkingLotDisplay(){
		parkingDisplay = `
		Welcome to the Parking lot!!!
		1. Do you wish to park your car?
		2. Do you wish to leave the parking lot?
		3. Display the parking status
		4. To go back to your home
			`;
			console.log(parkingDisplay)}
			
function parkCar(){
	for(let car_index = 0; car_index < parking_slot_list.length; car_index++){
		if (parking_slot_list[car_index] == 0){
		parking_slot_list[car_index]= 1
	}
	return "Car parked!"}
	
function leaveCarPark(car){
	if (parking_slot_list[car] == 1){
		parking_slot_list[car] = 0
	return "Car removed"}
	}
	
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
				console.log(parkCar())
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