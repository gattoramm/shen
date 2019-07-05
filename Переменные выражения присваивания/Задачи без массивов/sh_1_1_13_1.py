def sh_1_1_13_1( a: int, b: int ) -> int:
    """
        Вычисление НОД(a,b).
    """

    nod = max(a, b)

    while not( a % nod == 0 and b % nod == 0 ):
        nod -= 1

    return nod


if __name__ == '__main__':
    print('Check examples...')

    assert sh_1_1_13_1( 1, 10 ) == 1
    assert sh_1_1_13_1( 3, 57 ) == 3
    assert sh_1_1_13_1( 7 * 2 * 3, 57864 ) == 6
    assert sh_1_1_13_1( 4, 0 ) == 4
    assert sh_1_1_13_1( 6, 6 ) == 6

    print('Done!')
