package shen;
/*
Даны две целые переменные a, b. Составить фрагмент программы,
после исполнения которого значения переменных поменялись 
бы местами (новое значение a равно старому значению b и наоборот). 
*/
public class _1_1_1 {

	public static void main(String[] args) {

		int a = 34;
		int b = 567;
		System.out.println("a = " + a + ", b = " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("reverse");
		System.out.println("a = " + a + ", b = " + b);

	}

}
