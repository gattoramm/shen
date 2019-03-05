def _1_1_9(n: int):
    """ Последовательность Фибоначчи определяется так:
	    a(0) = 0, a(1)=1,a(k)=a(k-1)+a(k-2) при k>2.
	    Дано n, вычислить a(n).
	"""
    a0 = a1 = 1

    while n > 2:
        a0, a1 = a1, a1 + a0
        n -= 1
    return a1


a = _1_1_9(6)
print(a)
