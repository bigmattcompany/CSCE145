import java.util.Scanner;
public class lab02 {
	public static final double A = 9.8 ;
	public static final double F = 0.5 ;
	
	public static void main(String[] args) {
		
		
		
		//creating scanner obj
		Scanner key = new Scanner (System.in); {
			
			
			System.out.println("enter the initial velocity of the ball in meters per second at point a: ");
			double h = key.nextDouble();
			
			System.out.println("how much time in seconds does the ball take to reach point b: ") ; 
			double i = key.nextDouble();
			
			
			double L = h + A*i;
			
			double P = h*i + F*A*Math.pow(i, 2);
			
			
			System.out.println("the final velocity of the ball is ="+ L + "m/s");
			System.out.println("the distance traveled by the ball ="+ P +"meters");
		}
		
		
		
		
		
		
				
	}
	
	
	
	
	
	
}
