def increment(value):
    """
    A top level function that increments a value by one
    :param value: the value to increment
    :return: The incremented value
    """
    return value + 1


class Kata(object):
    """
    A Python class that increments a value by one. This uses a property to ensure that the underlying field can only
    be incremented using the public api, i.e. kata.value = 3 would not be possible because there is no setter for the
    value property. This also re-uses the increment top level function.
    """

    def __init__(self, value):
        self.__value = value

    def increment(self):
        self.__value = increment(self.__value)

    @property
    def value(self):
        return self.__value
