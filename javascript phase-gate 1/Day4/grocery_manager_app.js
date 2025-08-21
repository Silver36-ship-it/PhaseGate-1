new_array_list = []
var prompt = require('prompt-sync')();
function addGroceryItem(item){
		new_array_list.push(item);
		return "Item added successfully"
		}
		
function removeGroceryItem(item){
		new_array_list.splice(item);
		return "Item removed successfully"
		}
        
function showItems() {
        console.log(new_array_list);
		}

let menu;
	while(true) {
		showMenuItem();
		var user_input = prompt('Choose an option: ')
	if (user_input == 1){
		var item = prompt("Add item here: ")
		console.log(addGroceryItem(item))}
	else if (user_input == 2){
		var item = prompt("Remove item here: ")
		console.log(removeGroceryItem(item))}
	else if( user_input == 3){
		showItems()}
	else if( user_input == 0){
		console.log("Thank you, bye!")
		break}
	else
		console.log("Invalid input")
		}	
function showMenuItem() {
	items = `
	1. Add item
	2. Remove item
	3. Show an item
	0. Exit
		`;
	console.log(items);
		}
		