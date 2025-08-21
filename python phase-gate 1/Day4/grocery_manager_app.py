new_grocery_list = []
def add_grocery_item(item):
	new_grocery_list.append(item)
	return 'Item added successfully'
		
def remove_grocery_item(item):
	new_grocery_list.remove(item)
	return 'Item removed successfully'
        
def show_items():
	print(new_grocery_list)
	
def show_menu_item():
	items = """
	1. Add item
	2. Remove item
	3. Show an item
	0. Exit
		"""
	print(items)
def main():
    while True:
        show_menu_item()
        user_input = int(input("Choose an option: "))
        if user_input == 1:
            item = input("Add item here: ")
            print(add_grocery_item(item))
        elif user_input == 2:
            item = input("Remove item here: ")
            print(remove_grocery_item(item))
        elif user_input == 3:
            show_items()
        elif user_input == 0:
            print("Thank you, bye!")
            break
        else:
            print("Invalid input")
		
main()
	
	
	
