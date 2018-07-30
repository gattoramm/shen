package shen;
/*Дано целое число а и натуральное (целое неотрицательное) 
число n. Вычислить a^n . Другими словами, необходимо составить про- 
грамму, при исполнении которой значения переменных а и n не меняют- 
ся, а значение некоторой другой переменной (например, b) становится 
равным a^n. (При этом разрешается использовать и другие переменные.)
МЕТОДОМ РЕКУРСИИ
*/
public class _1_1_3_rec {
	
	static int row (int a, int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return a * row(a, n - 1);
		}
	}
	
	public static void main(String [] args) {
		
		int a = 2;
		int n = 10;
		System.out.println("a = " + a + ", n = " + n);
		int r = row(a, n);
		System.out.println("a ^ n = " + r);
		
	}
	
}
