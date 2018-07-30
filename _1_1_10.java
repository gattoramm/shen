package shen;
/*Последовательность Фибоначчи определяется так: a(0) = 0, 
a(1)=1,a(k)=a(k-1)+a(k-2) при k>2. Дано n, вычислить a(n).
требуется, чтобы число операций было
пропорционально log n. (Переменные должны быть целочисленными.)
*/
public class _1_1_10 {

	static int[][] matrSquare (int[][] T, int[][] M) {
		int[][] r =  new  int[2][2];
		r[0][0] = T[0][0] * M[0][0] + T[0][1] * M[1][0];
		r[0][1] = T[0][0] * M[0][1] + T[0][1] * M[1][1];
		r[1][0] = T[1][0] * M[0][0] + T[1][1] * M[1][0];
		r[1][1] = T[1][0] * M[0][1] + T[1][1] * M[1][1];
		return r;
		}
	
	public static void main(String []arg) {

		int n = 30;
		System.out.println("n = " + n);

		int [][] M = { { 1 , 1 } , { 1 , 0 } };
		int [][] T = { { 1 , 0 } , { 0 , 1 } };

		int k = n;

		while (k > 0) {

			if ( k % 2 == 0) {
				k = k / 2;
				M = matrSquare( M, M );
			}
			else {
				k = k - 1;
				T = matrSquare( T, M );
			} 

		}

		System.out.println("F(" + n + ") = " + T[0][1]);
	}

}
