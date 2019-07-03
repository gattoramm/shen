def sh_1_1_14(a: int, b: int):
    """ Написать модифицированный вариант алгоритма Евклида,
        использующий соотношения НОД(a,b) = НОД(a mod b, b) при a > b,
        НОД(a,b) = НОД(a, b mod a) при b > a. Для всех a,b > 0.
    """

    if a < b:
        a, b = b, a

    r = a%b

    while not( r == 0 ):
        a = r
        if a < b:
            a, b = b, a
        r = a%b
    return b

a = sh_1_1_14(6*90, 7*8)
print(a)