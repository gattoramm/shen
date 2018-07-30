package shen;
/*Последовательность Фибоначчи определяется так: a(0) = 0, 
a(1)=1,a(k)=a(k-1)+a(k-2) при k>2. Дано n, вычислить a(n).РЕКУРСИВНО 
*/
public class _1_1_9rec {
	
	static int fib (int n) {

		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fib( n - 2 ) + fib( n - 1 );
		}

	}
	
	public static void main(String []arg) {
		
		int n = 7;
		System.out.println("n = " + n);
		int s = fib(n);
		System.out.println("F(" + n + ") = " + s);
		
	}
	
}
