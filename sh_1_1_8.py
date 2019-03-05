def _1_1_8(n: int):
	""" Дано натуральное n, вычислить n! (0! = 1, n! = n · (n − 1)!).
	"""
	m = 1

	for k in range(1, n + 1):
		m *= k

	return m

a = _1_1_8(3)
print(a)