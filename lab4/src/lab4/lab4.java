package lab4;
import java.util.Scanner;
//matthew gates

public class lab4 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int books;
		
		
			System.out.println("how many books did you purchase this month?");
			books = key.nextInt();
			
			if(books < 0)
			{
				System.out.println("invalid amount");
				System.exit(0);
			}
		int points;
		
		switch(books)
		{
		case 0:
			points = 0;
			break;
		case 1:
			points = 5;
			break;
		case 2:
			points = 15;
			break;
		case 3:
			points = 30;
			break;
		default:
			points = 60;
			break;
		}
		
		if(books == 0)
		{
			System.out.println("you havent earned enough points. buy books to earn points");
		}
		
		else
		{
			System.out.println("you have "+ points +" points. you may redeem these points on your next purchase");
		}

	}

}
