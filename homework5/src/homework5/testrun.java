package homework5;
import java.util.Scanner;
public class testrun {
//Matthew Gates
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean continueprog = true;
		while (continueprog) {
			coffee coffee1 = new coffee();
			coffee coffee2 = new coffee();
			System.out.println("welcome to the coffee hour!!!!!1111");
			System.out.println("what is the name of your coffee?");
			String coffeeName = key.nextLine();
			System.out.println("what is the caffine content in your coffee?");
			int caffinecont = key.nextInt();
			key.nextLine();
			coffee1.setCoffee(coffeeName);
			coffee1.setcaffine(caffinecont);
			System.out.println("what is the name of your second coffee?");
			String coffeename2 = key.nextLine();
			System.out.println("what is the caffine content in your second coffee?");
			int caffinecont2 = key.nextInt();
			key.nextLine();
			coffee2.setCoffee(coffeename2);
			coffee2.setcaffine(caffinecont2);
			System.out.println(coffee1);
			System.out.println("it would take " + coffee1.risky() + "cups of " + coffee1.getCoffee() + "before its dangerous to drink more");
			System.out.println(coffee2);
			System.out.println("it would take " + coffee2.risky() + "cups of " + coffee2.getCoffee() + "before its dangerous to drink more");
			System.out.println("lets check if these are the same?" + coffee1.equals(coffee2));
			System.out.println("would you like to do this again? yae or nae: ");
			key.nextLine();
			String response = key.nextLine();
			if (!response.equalsIgnoreCase("yes")) {
				continueprog = false;
			}
		}
		

	}

}
