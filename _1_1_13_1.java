package shen;
/*Даны два натуральных числа a и b, не равные нулю одно- 
временно. Вычислить НОД(a,b) — наибольший общий делитель а и b. 
*/
public class _1_1_13_1 {

	public static void main(String[] args) {

		int a = 7*6;
		int b = 6*90;
		int k1;
		System.out.println(" a = " + a + ", b = " + b);

		if (a < b) {
			k1 = a;
		}
		else {
			k1 = b;
		}

		while( !((a%k1 == 0) && (b%k1 == 0)) ) {
			k1 = k1 - 1;
		}

		System.out.println("НОД = " + k1);

	}

}
