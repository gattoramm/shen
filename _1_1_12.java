package shen;
/*Дано натуральное n, вычислить 
1/0! + 1/1! +...+ 1/n!
требуется, чтобы количество операций (выполненных команд присваивания)
было бы порядка n (не более C n для некоторой константы C). 
*/
public class _1_1_12 {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("n = " + n);
		int k = 1;
		double f = 1;
		double s = 1.0;
		
		while(k <= n) {
			f = f * k;
			s = s +  1.0/f;
			k = k + 1;
		}
		
		System.out.println("S(" + n + ") = " + s);
	}

}
