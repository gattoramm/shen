package shen;

/*Даны натуральные a и b, не равные 0 одновременно. Найти 
d = НОД(a,b) и такие целые x и y,что d=a·x+b·y.
Решить задачу, используя в алгоритме Евклида деление с остатком. 
*/

public class _1_1_16 {

	public static void main(String[] args) {

		int a = 222;
		int b = 46;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("d = " + a + " * x + " + b + " * y");

		int p = 1;
		int q = 0;
		int r = 0;
		int s = 1;
		int k = 0;

		while ( !( (a == 0) | (b == 0) ) ) {
			if ( b < a ) {
				k = a/b;
				a = a - k * b;
				p = p - k * r;
				q = q - k * s;
			}
			else{
				k = b/a;
				b = b - k * a;
				r = r - k * p;
				s = s - k * q;
			}
		}

		int d = 0;
		int x = 0;
		int y = 0;
		
		if(a == 0) {
			d = b;
			x = r;
			y = s;
		}
		
		if(b == 0) {
			d = a;
			x = p;
			y = q;
		}
		
		System.out.println("НОД( a , b ) = " + d);
		System.out.println("x = " + x + ", y = " + y);
		
	}

}
