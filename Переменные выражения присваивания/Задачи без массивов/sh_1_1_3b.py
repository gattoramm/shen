def _1_1_3b(a: int, n: int):

    k, b = n, 1
    while k != 0:
        b *= a
        k -= 1
    return b
