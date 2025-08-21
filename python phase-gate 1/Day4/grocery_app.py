import grocery_manager_app

while True:
	grocery_manager_app.show_menu_item()
	user_input = int(input("Choose an option: "))
	if user_input == 1:
		item = input("Add item here: ")
		print(grocery_manager_app.add_grocery_item(item))
	elif user_input == 2:
		item = input("Remove item here: ")
		print(grocery_manager_app.remove_grocery_item(item))
	elif user_input == 3:
		grocery_manager_app.show_items()
	elif user_input == 0:
		print("Thank you, bye!")
		break
	else:
		print("Invalid input")