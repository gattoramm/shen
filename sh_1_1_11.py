def sh_1_1_11(n: int):
    """ Дано натуральное n, вычислить 	1/0! + 1/1! +...+ 1/n!
    """
    sum = 1.0
    for out_k in range(1, n + 1):
        mp = 1.0
        for in_k in range(1, out_k + 1):
            mp *= in_k
        sum += 1/mp
    return sum

a = sh_1_1_11(3)
print(a)