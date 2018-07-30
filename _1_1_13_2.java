package shen;
/*Даны два натуральных числа a и b, не равные нулю одно- 
временно. Вычислить НОД(a,b) — наибольший общий делитель а и b.
(алгоритм Евклида). Будем считать, что НОД(0,0)=0. Тогда 
НОД(a,b) = НОД(a-b,b) = НОД(a,b-a); НОД(a,0) = НОД(0,a) = a для всех 
a,b>0. 
*/
public class _1_1_13_2 {

	public static void main(String[] args) {

		int a = 129;
		int b = 6;
		int m = a;
		int n = b;
		
		System.out.println(" a = " + a + ", b = " + b);
		
		while( !( (m == 0) | (n == 0) ) ) {
			if( n <= m ) {
				m = m - n;
			}
			else{
				n = n - m;
			}
		}

		if ( m == 0 ) {
			System.out.println("НОД = " + n);
		}

		if ( n == 0 ) {
			System.out.println("НОД = " + m);
		}
    
		//System.out.println("НОД = " + k)
    
	}

}
