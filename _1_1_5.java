package shen;
/*Даны натуральные числа а, b . Вычислить произведение a · b, 
используя в программе лишь операции +, -, =, <>. 
*/
public class _1_1_5 {

	public static void main(String[] args) {

		int a = 45;
		int b = 100;
		int Sum = 0;
		System.out.println("a = " + a + ", b = " + b);
		int k = b;

		while (k > 0) {
			k = k - 1;
			Sum = Sum + a;
		}

		System.out.println("Sum a + b = " + Sum);

	}

}
