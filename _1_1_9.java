package shen;
/*Последовательность Фибоначчи определяется так: a(0) = 0, 
a(1)=1,a(k)=a(k-1)+a(k-2) при k>2. Дано n, вычислить a(n). 
*/
public class _1_1_9{
	
	public static void main(String [] arr){
		
		int n = 7;
		System.out.println("n = " + n);
		
		int a0 = 0;
		int a1 = 1;
		int tmp;
		int s;
		int mm = n;
		
		while ( n > 2) {
			tmp = a1;
			a1 = a0 + a1;
			a0 = tmp;
			n = n - 1;
		}

		if (n == 0) {
			s = a0;
		}
		else {
			s = a0 + a1;
		}
		
		System.out.println("F(" + mm + ") = " + s);
		
	}
	
}
