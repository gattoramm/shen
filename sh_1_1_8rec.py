def _1_1_8rec(n: int):
	""" Дано натуральное n, вычислить n! (0! = 1, n! = n · (n − 1)!).
	    МЕТОДОМ РЕКУРСИИ
	"""
	if n != 0:
		return n * _1_1_8rec(n - 1)
	return 1

a = _1_1_8rec(4)
print(a)