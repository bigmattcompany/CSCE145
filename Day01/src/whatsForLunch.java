import java.util.Scanner;

public class whatsForLunch {

	public static void main(String[] args) {
		
		//print a message on the console
		
		/*
		 * multi line comment
		 * what the sigma
		 */
		
		System.out.println("welcome to my first java program!");
		
		// \n is the character for a new line
		System.out.println("\"java\" is fun!");
		
		//create scanner object
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("whats for lunch today? \nenter entree:");
		
		String entree; //declared empty variable
		
		entree = key.nextLine();
		
		System.out.println("entree: "+entree);
		// + is concatenation operator
		// = is assignment operator

	}

}
