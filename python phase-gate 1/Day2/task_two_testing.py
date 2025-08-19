import unittest
import task_two_function

class TestTaskTwoFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		task_two_function.average_score(65,67,65)
	def test_that_the_function_returns_true_value(self):
		result = task_two_function.average_score(80,75,90)
		self.assertEqual(result,'B')
	def test_that_no_string_is_inputted_in_the_first_slot(self):
		self.assertRaises(ValueError,task_two_function.average_score,"hi",4,3)
	def test_that_no_string_is_inputted_in_the_second_slot(self):
		self.assertRaises(ValueError,task_two_function.average_score,"hi","hello",3)
	def test_that_no_string_is_inputted_in_the_third_slot(self):
		self.assertRaises(ValueError,task_two_function.average_score,"hi","hello","hey")
		
	
	