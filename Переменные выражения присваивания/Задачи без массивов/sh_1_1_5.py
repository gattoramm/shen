def sh_1_1_5(a: int, b: int):
    """
        Вычисление a*b, используя лишь операции +, -, =, <>.
    """

    sign = 1

    if a < 0:
        a = -a
        sign = -sign

    if b < 0:
        b = -b
        sign = -sign

    if a < b:
        a += b
        b = a - b
        a -= b

    sum, k = 0, 0
    while k != b:
        sum += a
        k++
    return sum * sign


if __name__ == '__main__':
    print('Check examples...')

    assert sh_1_1_5(2, 5) == 2 * 5
    assert sh_1_1_5(5, 2) == 5 * 2
    assert sh_1_1_5(3, -4) == 3 * -4
    assert sh_1_1_5(-5, -8) == -5 * -8
    assert sh_1_1_5(4, 0) == 4 * 0
    assert sh_1_1_5(sh_1_1_5(2, 3), sh_1_1_5(2, -4)) == (2 * 3) * (2 * -4)

    print('Done!')
