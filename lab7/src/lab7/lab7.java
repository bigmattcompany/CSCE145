package lab7;
//Matthew Gates
import java.util.Scanner;
public class lab7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the amount of rows for the first matrix: ");
		int rows = scanner.nextInt();
		System.out.println("enter the amount of collums for the first matrix: ");
		int cols = scanner.nextInt();
		
		int[][] matrix1 = new int[rows][cols];
		
		int rows2, cols2;
		do {
			System.out.println("enter the amount of rows for the second matrix: ");
			rows2 = scanner.nextInt();
			System.out.println("enter the amount of collums for the second matrix: ");
			cols2 = scanner.nextInt();
			
			if (rows2 != rows || cols2 != cols) {
				System.out.println("enter the same dimensions as the first matrix");
			}
		} while (rows2 != rows || cols2 != cols);
		
		int[][] matrix2 = new int[rows2][cols2];
		
		System.out.println("enter values for first matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("element [" + i + "][" + j + "]: ");
				matrix1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("enter values for the second matrix: ");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				System.out.print("element [" + i +"][" + j + "]: ");
				matrix2[i][j] = scanner.nextInt();
			}
		}
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("result of the matrix addition: ");
		displayMatrices(matrix1, matrix2, result);
		

	}
	private static void displayMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		
		for (int i = 0; i < rows; i++) {
			System.out.println("| ");
			for (int j = 0; j < cols; j++) { 
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.print("| ");
		}
		System.out.print(" + ");
		
		for (int i = 0; i < rows; i++) {
			System.out.print("| ");
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.print("| = ");
		}
		
		for (int i = 0; i < rows; i++) { 
			System.out.print("| ");
			for (int j = 0; j < cols; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.print("| ");
		}
		System.out.println();
	}

}
