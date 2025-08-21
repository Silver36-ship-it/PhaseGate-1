new_grocery_list = []
def add_grocery_item(item):
	if type(item) == int:
		raise ValueError
	if item == "":
		raise ValueError
	new_grocery_list.append(item)
	return 'Item added successfully!'
		
def remove_grocery_item(item):
	if type(item) == int:
		raise ValueError
	if item == "":
		raise ValueError
	new_grocery_list.remove(item)
	return 'Item removed successfully!'
     
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