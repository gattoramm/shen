package shen;
/*Решить предыдущую задачу, если требуется, чтобы число дей- 
ствий (выполняемых операторов присваивания) было порядка log n (то 
есть не превосходило бы C log n для некоторой константы C ; log n — это 
степень, в которую нужно возвести 2, чтобы получить n). 
*/
public class _1_1_4 {

	public static void main(String[] args) {

		int a = 2;
		int n = 25;
		int k = n;
		int b = 1;
		int c = a;

		while (k != 0) {

			if ( k % 2 == 0) {
				k = k / 2;
				c = c * c;
			}
			else {
				k = k - 1;
				b = b * c;
			}

		}

		System.out.println("a = " + a + ", n = " + n);
		System.out.print("a^n = ");
		System.out.println(b);

	}

}
