package homework03;
import java.util.Scanner;
import java.util.Random;
//matthew gates

public class homework3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//the three options
		String[] options = {"rock", "paper", "scissors"};
		
		//first thing you see when you run program
		System.out.println("enter your choice: rock, paper, scissors");
		String userChoice = scanner.nextLine();
		
		
		
		String computerChoice = options[random.nextInt(options.length)];
		System.out.println("computer chose: " + computerChoice);
		//prints result
		String result = determineWinner(userChoice, computerChoice);
		System.out.println(result);
		
		scanner.close();
		}
		
		//list of valid choices
		boolean isValidChoice(String choice) {
			return choice.equalsIgnoreCase("rock")||
					choice.equalsIgnoreCase("paper")||
					choice.equalsIgnoreCase("scissors");
			}
		//determining the winner
		private static String determineWinner(String userChoice, String computerChoice) {
			if(userChoice.equalsIgnoreCase(computerChoice)) {
				return "tie"; 
				
			}
			//choice between rock paper and scissors
			switch(userChoice.toLowerCase()) {
			case "rock":
				return computerChoice.equalsIgnoreCase("scissors") ?
						"you win. rock beats scissors" : "you lose. paper beats rock";
			case "paper":
				return computerChoice.equalsIgnoreCase("rock") ?
						"you win. paper beats rock" : "you lose. scissors beat paper";
			case "scissors":
				return computerChoice.equalsIgnoreCase("paper") ?
						"you win. scissors beat paper" : "you lose. rock beats scissors";
				default:
					return "invalid game state";
			}
		
		
		

	

	}

}
