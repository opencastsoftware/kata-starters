from .context import kata
from kata import Kata

import unittest


class KataTestSuite(unittest.TestCase):

    def test_function_increments_by_one(self):
        self.assertEqual(2, kata.increment(1))

    def test_class_increments_by_one(self):
        kata_class = Kata(2)
        kata_class.increment()
        self.assertEqual(3, kata_class.value)


if __name__ == '__main__':
    unittest.main()
