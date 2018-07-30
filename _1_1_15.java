package shen;
/*Даны натуральные a и b, не равные 0 одновременно. Найти 
d=НОД(a,b) и такие целые x и y,что d=a·x+b·y. 
*/
public class _1_1_15 {

	public static void main(String[] args) {
		
		int a = 222;
		int b = 46;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("d = " + a + " * x + " + b + " * y");
		
		int true_a = a;
		int true_b = b;
		int p = 1;
		int q = 0;
		int r = 0;
		int s = 1;
		
		while ( !( (a == 0) | (b == 0) ) ) {

			if ( b < a ) {
				a = a - b;
				p = p - r;
				q = q - s;
			}
			else{
				b = b - a;
				r = r - p;
				s = s - q;
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
		int sum = true_a * x + true_b * y;
		System.out.println("Test:");
		System.out.println("a * x + b * y = " + sum);
		
	}

}
