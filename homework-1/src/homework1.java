import java.util.Scanner;
public class homework1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String firstName = " ";
		String lastName = " ";
		String age = " ";
		String phoneNumber = " ";
		String major = " ";
		String year = " ";
		String todaysDate1 = " ";
		String todaysDate2 =" ";
		String todaysDate3 =" ";
		String anyClubs = " ";
		String favClass = " ";
		String favFood = " ";
		
		System.out.println("What is your first name?");
		String response = key.next();
		firstName = response;
		
		System.out.println("What is your last name?");
		String response1 = key.next();
		lastName = response1;
		
		System.out.println("What year were you born?");
		String response2 = key.next();
		age = response2;
		
		System.out.println("What is your phone number?");
		String response3 = key.next();
		phoneNumber = response3;
		
		System.out.println("What is your major?");
		String response4 = key.next();
		major = response4;
		
		System.out.println("What day is it today?");
		String response5 = key.next();
		todaysDate1 = response5;
		
		System.out.println("What month is it?");
		String response6 = key.next();
		todaysDate2 = response6;
		
		System.out.println("What year is it?");
		String response7 = key.next();
		todaysDate3 = response7;
		
		System.out.println("What clubs are you in, if any?");
		String response8 = key.next();
		anyClubs = response8;
		
		System.out.println("What is your favorite class so far?");
		String response9 = key.next();
		favClass = response9;
		
		System.out.println("What is your favorite food?");
		String response10 = key.next();
		favFood = response10;
		
		System.out.println("Here is a quick intro for "+ firstName + " " + lastName +":\n" + "You were born in the year " + age + ". you are a part of: " + anyClubs + " and your favorite food is " + favFood + ". \nyour favorite class is " + favClass + " and you are major in " + major + ". you can be reached at " + phoneNumber + ". \n last updated: " + todaysDate1 + "." + todaysDate2 + "." + todaysDate3);
	}

}
