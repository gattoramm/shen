package shen;
/*Дано натуральное n, вычислить n! (0! = 1, n! = n · (n − 1)!). 
 * МЕТОДОМ РЕКУРСИИ*/

public class _1_1_8rec {

	static int factorial (int n) {

		if (n != 0) {
			return n * factorial(n - 1);
		}
		else {
			return 1;
		}

	}
	
	public static void main(String [] aaa) {

		int n = 6;
		System.out.println("n = " + n);
		int b = factorial(n);
		System.out.println("n! = " + b);

	}
	
}
