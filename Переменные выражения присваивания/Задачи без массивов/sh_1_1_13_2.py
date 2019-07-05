def sh_1_1_13_2( a: int, b: int ) -> int:
    """
        Вычисление НОД(a,b) алгоритмом Евклида.
    """

    m, n = a, b

    while not( m == 0 or n == 0 ) :
        if n > m:
            n -= m
        else:
            m -= n

    if m == 0: return n

    return m


if __name__ == '__main__':
    print('Check examples...')

    assert sh_1_1_13_2( 1, 10 ) == 1
    assert sh_1_1_13_2( 3, 57 ) == 3
    assert sh_1_1_13_2( 7 * 2 * 3, 57864 ) == 6
    assert sh_1_1_13_2( 4, 0 ) == 4
    assert sh_1_1_13_2( 0, 4 ) == 4
    assert sh_1_1_13_2( 6, 6 ) == 6

    print('Done!')