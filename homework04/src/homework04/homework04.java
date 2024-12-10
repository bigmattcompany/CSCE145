package homework04;
//matthew gates
import java.util.Scanner;

public class {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		double[] radius = null;
		
		while (true) {
			System.out.println("menu");
			System.out.println("1. set collection size and all circle radius");
			System.out.println("2. sort and display each area in increasing order");
			System.out.println("3. sort and display each area in decreasing order");
			System.out.println("4. find and display each unique circles area");
			System.out.println("5. quit");
			
			int input = scanner.nextInt();
			
			switch (input) {
			case 1: 
				System.out.println("enter the number of circles: ");
				size = scanner.nextInt();
				if (size<=0) {
					System.out.println("enter a positive number");
					continue;
					
				}
				radius = new double[size];
				for (int i = 0; i < size; i++) {
					System.out.println("enter radius for circle" + (i + 1) + ":");
					radius[i] = scanner.nextDouble();
				}
				break;
			case 2:
				if (radius == null) {
					System.out.println("collection not created");
				} else {
					sortincreasing(radius);
					display(radius);
				}
				break;
			case 3:
				if (radius == null) {
					System.out.println("collection not created");
				} else {
					sortdecreasing(radius);
					display(radius);
				}
				break;
			case 4:
				if (radius == null) {
					System.out.println("collection not created");
				} else {
					uniquedisplay(radius);
				}
				break;
			case 5: 
				System.out.println("exiting program");
				scanner.close();
				System.exit(0);
				default:
					System.out.println("invalid choice");
			}
		}
		
	}
	
	public static void sortincreasing(double[] radius) {
		for (int i = 0; i < radius.length - 1; i++) {
			for (int j = 0; j < radius.length - i - 1; j++) {
				if (Math.PI * radius[j] * radius[j] > Math.PI * radius[j + 1] * radius[j + 1]) {
					double temp = radius[j];
					radius[j] = radius[j+1];
					radius[j + 1] = temp;
				}
			}
		}
	}
	public static void sortdecreasing(double[] radius) {
		for (int i = 0; i < radius.length - 1; i++) {
			for (int j = 0; j < radius.length - i - 1; j++) {
				if (Math.PI * radius[j] * radius[j] < Math.PI * radius[j + 1] * radius[j + 1]) {
					double temp = radius [j];
					radius[j+1] = temp;
				}
			}
		}
	}
	public static void display(double[] radius) {
		System.out.println("areas: ");
		for (double radius : radius) {
			System.out.println("%.2f ", Math.PI * radius * radius);
		}
		System.out.println();
	}
	public static void uniquedisplay(doulbe[] radius) {
		System.out.println("unique areas: ");
		for (int j = 0; j < radius.length; j++) {
			boolean unique = true;
			for (int j = 0; j < radius.length; j++) {
				if (i != j && Math.abs(radius[i] - radius[j]) < 0.0001) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("%.2f ", Math.PI * radius[i] * radius[i]);
			}
		}
		System.out.println();
	}
}