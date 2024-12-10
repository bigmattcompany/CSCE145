import java.util.Scanner;
public class lab3 {
//Matthew Gates

	public static final double PR = 99;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("enter the total number of software packages ordered");
		
		double software = key.nextDouble();
		double discount = 0;
		
		if(software<= 0)
		{
			System.out.println("invalid value");
			System.exit(0);
		}
		else if(software > 0 && software < 10)
		{
			discount = 0;
		}
		else if(software >= 10 && software < 20)
		{
			discount = .2;
		}
		else if(software >= 20 && software < 50)
		{
			discount = .3;
		}
		else if(software >= 50 && software < 100)
		{
			discount = .4;
		}
		else if(software > 100)
		{
			discount = .5;
		}
		
		double beforeDisc = software*PR;
		System.out.println("total amount before discount = $" + beforeDisc);
		double calcDisc = beforeDisc*discount;
		System.out.println("amount of discount = $" + calcDisc);
		double finalTotal = beforeDisc - calcDisc;
		System.out.println("final total bill amount = $" + finalTotal);

	}

}
