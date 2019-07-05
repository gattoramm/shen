def sh_1_1_7( a: int, d: int ) -> int:
    """
        Вычисление частного q и остатка r при делении
        а (целое неотрицательное) на d (целое положительное),
        не используя операций div и mod.
    """

    r, q = a, 0
    while r >= d:
        r -= d
        q += 1
    return ( q, r )


if __name__ == '__main__':
    print('Check examples...')

    assert sh_1_1_7( 19, 5 ) == ( 3, 4 )
    assert sh_1_1_7( 25, 5 ) == ( 5, 0 )
    assert sh_1_1_7( 17, 4 ) == ( 4, 1 )

    print('Done!')
