import java.util.Scanner;
public class lab5 {
//matthew gates
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("how much will you spend on chocolate");
		int dollars = key.nextInt();
		
		if(dollars < 0)
		{
			System.out.println("invalid number");
			System.exit(0);
		}
		else
		{
			int chocolate = dollars;
			int coupons = chocolate;
			while(coupons >= 6)
			{
				int freechocolate = coupons / 6;
				chocolate += freechocolate;
				coupons = coupons % 6 + freechocolate;
				
			}
			System.out.println("the amount of chocolate you purchased is " + chocolate + ". the amount of coupons you have to use later are " + coupons);
		}

	}

}
