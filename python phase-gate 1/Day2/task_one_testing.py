import unittest
import task_one_function

class TestTaskOneFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		task_one_function.age_check(3,4)
	def test_that_the_function_returns_true_value(self):
		result = task_one_function.age_check(40,18)
		self.assertEqual(result,4)
	def test_that_the_first_input_is_not_less_than_or_equal_to_zero(self):
		self.assertRaises(ValueError,task_one_function.age_check,3,0)
	def test_that_the_second_input_is_not_less_than_or_equal_to_zero(self):
		self.assertRaises(ValueError,task_one_function.age_check,0,3)
	def test_that_the_first_input_is_not_string(self):
		self.assertRaises(ValueError,task_one_function.age_check,"hi",3)
	def test_that_the_second_input_is_not_string(self):
		self.assertRaises(ValueError,task_one_function.age_check,"hi","hello")
	def test_that_the_first_input_is_not_float(self):
		self.assertRaises(ValueError,task_one_function.age_check,3.4,"hello")
	def test_that_the_second_input_is_not_float(self):
		self.assertRaises(ValueError,task_one_function.age_check,3.4,5.4)





