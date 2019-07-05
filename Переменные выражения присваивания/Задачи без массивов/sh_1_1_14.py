def sh_1_1_14( a: int, b: int ) -> int:
    """
        Вычисление НОД(a,b) модифицированным вариантом алгоритма Евклида.
    """

    
    if a < b:
        a, b = b, a



    while not( 0 == b or 0 == a%b ):
        a = a%b
        if a < b:
            a, b = b, a

    return b


if __name__ == '__main__':
    print('Check examples...')

    assert sh_1_1_14( 1, 10 ) == 1
    assert sh_1_1_14( 3, 57 ) == 3
    assert sh_1_1_14( 7 * 2 * 3, 57864 ) == 6
    #assert sh_1_1_14( 4, 0 ) == 4
    assert sh_1_1_14( 6, 6 ) == 6

    print('Done!')