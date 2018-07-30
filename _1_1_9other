package shen;
/*Последовательность Фибоначчи определяется так: a(0) = 0, 
a(1)=1,a(k)=a(k-1)+a(k-2) при k>2. Дано n, вычислить a(n). 
*/
public class _1_1_9other{
	
	public static void main(String [] arr){
		
		int n = 7;
		System.out.println("n = " + n);
		
		int a0 = 0;
		int a1 = 1;
		int tmp;
		int s;
		
		if (n == 0) {
			s = a0;
		}
		else {

			for (int i = 0; i < n - 2 ; i = i + 1) {
				tmp = a1;
				a1 = a0 + a1;
				a0 = tmp;
			}

			s = a0 + a1;
		}
		
		System.out.println("F(" + n + ") = " + s);
		
	}
	
}
