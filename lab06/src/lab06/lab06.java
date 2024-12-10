package lab06;
import java.util.Scanner;
public class lab06 {
//Matthew Gates
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("enter the height of the triangle: ");
		int num = key.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the triangle
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        

	}

}
