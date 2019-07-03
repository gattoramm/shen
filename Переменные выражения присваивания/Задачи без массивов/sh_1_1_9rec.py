def sh_1_1_9rec(n: object) -> object:
    """ Последовательность Фибоначчи определяется так:
	    a(0) = 0, a(1)=1,a(k)=a(k-1)+a(k-2) при k>2.
	    Дано n, вычислить a(n).
	"""
    A = {0: 0, 1: 1}

    if n in A:
        return A[n]

    A[n] = sh_1_1_9rec(n - 1) + sh_1_1_9rec(n - 2)
    return A[n]

a = sh_1_1_9rec(10)
print(a)