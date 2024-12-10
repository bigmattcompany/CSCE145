import java.util.Scanner;
public class DecisionsGame {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String contestant1Prize = "nothing";
		String contestant2Prize = "nothing";
		
		String markerPrize = "a red marker";
		String deskPrize = "a black pen";
		String bagPrize = "a Kit Kat";
		
		System.out.println("Contestant1: I will give you this marker. would you like to keep it or trade it with what\'s on my desk or what\'s in my bag. Enter:keep, desk, or bag");
		
		String response = key.next();
		
		if (response.equalsIgnoreCase("desk"))
		{
			contestant1Prize = deskPrize;
			
			System.out.println("Contestant2: Would you like to keep the marker or trade it with what is in my bag. enter:keep, or bag");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("bag"))
			{
				contestant2Prize = bagPrize;
			}
			else if(response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = markerPrize;
			}
			else
			{
				System.out.println("You got nothing");
			}
		}
		else if(response.equalsIgnoreCase("keep"))
		{
			contestant1Prize = markerPrize;
			
			System.out.println("Contestant2: would you like to pick what is on my desk or what is in my bag. enter:desk, or bag");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("desk"));
			{
				contestant2Prize = deskPrize;
			}
			else if(response.equalsIgnoreCase("bag"));
			{
				contestant2Prize = bagPrize;
			}
			else
			{
				System.out.println("you got nothing");
			}
		}
		else if(response.equalsIgnoreCase("bag"))
		{
			contestant1Prize = bagPrize;
		}

	}

}
