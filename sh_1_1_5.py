def _1_1_5(a: int, b: int):
	""" Даны натуральные числа а, b . Вычислить произведение a*b,
	    используя в программе лишь операции +, -, =, <>.
	"""
	sum, k = 0, 0
	while k != b:
		sum += a
		k += 1
	return sum

a = _1_1_5(5, 6)
print(a)