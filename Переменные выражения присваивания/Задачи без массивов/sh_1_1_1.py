def 1_1_1(a: int, b: int):
    """ Меняет местами 2 входных параметра
    """

    tmp = a
    a = b
    b = tmp
    return (a, b)
