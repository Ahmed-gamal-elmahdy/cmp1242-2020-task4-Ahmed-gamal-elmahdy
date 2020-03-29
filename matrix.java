import java.util.Scanner;

/*
 * Ahmed gamal
 * Bn:3 sec:1
 * ahmedabbs9@gmail.com
 */

public class matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Arow, Acol, Brow, Bcol;
		System.out.println("Enter no. of rows in A");
		Arow = input.nextInt();
		System.out.println("Enter no. of columns in A");
		Acol = input.nextInt();
		int[][] A = new int[Arow][Acol];
		for (int i = 0; i < Arow; i++) {
			for (int j = 0; j < Acol; j++) {
				System.out.println("Enter the element in row " + i + " column " + j + " ");
				A[i][j] = input.nextInt();

			}
		}
		System.out.println("Enter no. of rows in B");
		Brow = input.nextInt();
		System.out.println("Enter no. of columns in B");
		Bcol = input.nextInt();
		int[][] B = new int[Brow][Bcol];
		for (int i = 0; i < Brow; i++) {
			for (int j = 0; j < Bcol; j++) {
				System.out.println("Enter the element in row " + i + " column " + j + " ");
				B[i][j] = input.nextInt();

			}
		}
		if(Acol!=Brow) {
			System.out.println("Please Enter correct size ");
			System.exit(0);
		}
		int Crow = Arow, Ccol = Bcol;
		int[][] C = new int[Crow][Ccol];
		for (int i = 0; i < Crow; i++) {
			for (int j = 0; j < Ccol; j++) {
				for (int k = 0; k < Brow; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for (int i = 0; i < Crow; i++) {
			for (int j = 0; j < Ccol; j++) {
				System.out.print("  " + C[i][j] + " ");

			}
			System.out.println();
		}

	}
}
