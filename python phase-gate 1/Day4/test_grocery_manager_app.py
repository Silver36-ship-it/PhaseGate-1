import unittest
import grocery_manager_app

class TestAddGroceryItemFunction(unittest.TestCase):
	def test_grocery_manager_function_exist(self):
		grocery_manager_app.add_grocery_item('string')
	def test_that_no_int_is_inputted(self):
		self.assertRaises(ValueError,grocery_manager_app.add_grocery_item,3)
	def test_that_no_empty_string_is_inputted(self):
		self.assertRaises(ValueError,grocery_manager_app.add_grocery_item,"")	
	

class TestRemoveGroceryItemFunction(unittest.TestCase):	
	def test_grocery_manager_function_exist(self):
		grocery_manager_app.remove_grocery_item('string')
	def test_that_no_int_is_inputted(self):
		self.assertRaises(ValueError,grocery_manager_app.remove_grocery_item,3)
	def test_that_no_empty_string_is_inputted(self):
		self.assertRaises(ValueError,grocery_manager_app.remove_grocery_item,"")	
