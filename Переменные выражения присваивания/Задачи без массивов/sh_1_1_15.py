def sh_1_1_15(a: int, b: int):
    """ Даны натуральные a и b, не равные 0 одновременно. Найти
        d=НОД(a,b) и такие целые x и y,что d=a·x+b·y.
    """
    p, q = 1, 0
    r, s = 0, 1
    d = x = y = 0

    while not(a == 0 or b == 0):
        if b < a:
            a -= b
            p -= r
            q -= s
        else:
            b -= a
            r -= p
            s -= q

    if a == 0:
        d = b
        x = r
        y = s
    if b == 0:
        d = a
        x = p
        y = q
    return d, x, y

a = sh_1_1_15(222, 46)
print(a)