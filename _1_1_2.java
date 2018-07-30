package shen;
/*Решить предыдущую задачу, не используя дополнительных 
переменных (и предполагая, что значениями целых переменных могут 
быть произвольные целые числа). 
*/
public class _1_1_2 {

	public static void main(String[] args) {

		int a = 3400000;
		int b = 567;
		System.out.println("a = " + a + ", b = " + b);
		a =a + b ;
		b = a - b;
		a =a - b;
		System.out.println("reverse");
		System.out.println("a = " + a + ", b = " + b);

	}

}
