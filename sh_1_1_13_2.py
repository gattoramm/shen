def sh_1_1_13_2(a: int, b: int):
    """ Даны два натуральных числа a и b, не равные нулю одновременно.
        Вычислить НОД(a,b) — наибольший общий делитель а и b.
        Fлгоритм Евклида. Будем считать, что НОД(0,0)=0. Тогда
        НОД(a,b) = НОД(a-b,b) = НОД(a,b-a); НОД(a,0) = НОД(0,a) = a
        для всех a,b > 0.
    """
    m, n = a, b

    while  not(m == 0 or n == 0) :
        if n <= m:
            m -= n
        else:
            n -= m

    if m == 0: return n
    if n == 0: return m

a = sh_1_1_13_2(6*90, 7*8)
print(a)