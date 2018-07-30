package shen;
/*Написать модифицированный вариант алгоритма Евклида, 
использующий соотношения НОД(a,b) = НОД(a mod b, b) при a > b, 
НОД(a,b) = НОД(a, b mod a) при b > a. 
*/
public class _1_1_14 {

	public static void main(String[] args) {
		int a = 128;
		int b = 4;
		System.out.println(" a = " + a + ", b = " + b);
		//определим максимум
		if (a < b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		
		int r = a%b;
		
		while( !( r == 0 ) ) {
			
			a = r;
			
			if (a < b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			
			r = a%b;
			
		}
		
		System.out.println("НОД = " + b);
		
	}

}
