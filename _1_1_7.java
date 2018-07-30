package shen;
/*Дано натуральное (целое неотрицательное) число а и целое 
положительное число d. Вычислить частное q и остаток r при делении а 
на d, не используя операций div и mod. 
*/
public class _1_1_7 {

	public static void main(String[] args) {

		int a = 35786;
		int d = 17;
		System.out.println(a + " = q * " + d + " + r");
		int r = a;
		int q = 0;

		while (r >= d) {
			r = r - d;
			q = q + 1;
		}

		System.out.println("q = " + q + ", r = " + r);

	}

}
