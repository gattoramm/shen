package shen;
/*Дано натуральное n, вычислить 	1/0! + 1/1! +...+ 1/n! 
*/
public class _1_1_11 {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("n = " + n);
		int k = 1;
		double f;
		int m;
		double s = 1.0;

		while(k <= n) {
			m = 1;
			f = 1;
			while(m <= k) {
				f = f * m;
				m = m + 1;
			}
			s = s + 1.0 / f;
			k = k + 1;
		}

		System.out.println("S(" + n + ") = " + s);
	}

}
