import unittest
import task_three_function

class TestTaskThreeFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		task_three_function.display_names_that_likes_this(["hello","hi"])
	def test_that_the_function_returns_true_value(self):
		result = task_three_function.display_names_that_likes_this(["Jacob","Alex"])
		self.assertEqual(result,'Jacob and Alex likes this')
	def test_that_no_empty_string_is_inputted(self):
		self.assertRaises(ValueError,task_three_function.display_names_that_likes_this,"")
	def test_that_no_integer_is_inputted(self):
		self.assertRaises(ValueError,task_three_function.display_names_that_likes_this,3)
