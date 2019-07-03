def sh_1_1_16(a: int, b: int):
    """ Даны натуральные a и b, не равные 0 одновременно. Найти
        d=НОД(a,b) и такие целые x и y,что d=a·x+b·y.
        Решить задачу, используя в алгоритме Евклида деление с остатком.
    """
    p, q = 1, 0
    r, s = 0, 1
    d = x = y = 0

    while not(a == 0 or b == 0):
        if b < a:
            k = a // b
            a -= k * b
            p -= k * r
            q -= k * s
        else:
            k = b // a
            b -= k * a
            r -= k * p
            s -= k * q

    if a == 0:
        d = b
        x = r
        y = s
    if b == 0:
        d = a
        x = p
        y = q

    return d, x, y

a = sh_1_1_16(222, 46)
print(a)