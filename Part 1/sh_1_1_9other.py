def sh_1_1_9other(n: int):
    """ Последовательность Фибоначчи определяется так:
	    a(0) = 0, a(1)=1,a(k)=a(k-1)+a(k-2) при k>2.
	    Дано n, вычислить a(n).
	"""
    a0, a1 = 0, 1

    for k in range(n):
        a0, a1 = a1, a1 + a0

    return a0

a = sh_1_1_9other(10)
print(a)