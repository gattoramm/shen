def _1_1_2(a: int, b: int):
    """ Решить предыдущую задачу, не используя дополнительных переменных
	    (и предполагая, что значениями целых переменных могут
	    быть произвольные целые числа).
	"""
    a += b
    b = a - b
    a -= b
    return a, b


a = _1_1_2(4, 77)
print(a)