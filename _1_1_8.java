package shen;
/*Дано натуральное n, вычислить n! (0! = 1, n! = n · (n − 1)!). */
public class _1_1_8 {

	public static void main (String [] arg) {
		
		int n = 6;
		System.out.println("n = " + n);
		
		int b = n;
		
		while (n > 1) {

			b = b * (n - 1);
			n = n - 1;
		}
		
		System.out.println("n! = " + b);
		
	}
	
}
