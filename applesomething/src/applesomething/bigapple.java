package applesomething;
//matthew gates
import java.util.Scanner;
public class bigapple {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		apple applefirst = new apple();
		System.out.println("welcome to the big apple where we test your apples!!!!!!!!111111");
		System.out.println("creating the first apple. . . .");
		System.out.println("default values of first apple:");
		
		System.out.println("enter the type of second apple");
		String type = key.nextLine();
		System.out.println("enter the weight of second apple: ");
		double weight = key.nextDouble();
		System.out.println("enter the price of second apple: ");
		double price = key.nextDouble();
		
		apple applesecond = new apple(type, weight, price);
		System.out.println("creating second apple. . . . ");
		System.out.println("values of second apple: ");
		
		key.close();

	}

}
