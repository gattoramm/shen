package shen;
/*Даны натуральные числа а и b. Вычислить их сумму а + b. 
*Использовать операторы присваивания лишь вида 
*	<переменная1> := <переменная2>, 
*	<переменная> := <число>, 
*	<переменная1> := <переменная2> + 1. 
*/
public class _1_1_6{

	public static void main(String  [] args) {

		int a = 34;
		int b = 4600;
		System.out.println("a = " + a + ", b = " + b);
		int c2 = 0;
		int c = 0;
		int s = a;

		while (c2 < b) {
			c = s + 1;
			s = c;
			c2 = c2 + 1;
		}

		System.out.println("a + b = " + s);

	}
	
}
