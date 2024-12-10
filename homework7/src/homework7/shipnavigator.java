package homework7;
import java.util.Scanner;
//matthew gates
public class shipnavigator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		cruiseship cruise1 = new cruiseship();
		cruiseship cruise2 = new cruiseship();
		
		cargoship cargo = new cargoship();
		
		System.out.println("Enter details for Cruise Ship 1:");
        System.out.println("Name: ");
        cruise1.setname(scanner.nextLine());
        System.out.println("Launch Date (mm/dd/yyyy): ");
        cruise1.setlaunchdate(scanner.nextLine());
        System.out.println("Passenger Capacity: ");
        cruise1.setpassengercap(scanner.nextInt());
        System.out.println("Crew Members: ");
        cruise1.setcrewmem(scanner.nextInt());
        scanner.nextLine();

        
        System.out.println("\nEnter details for Cruise Ship 2:");
        System.out.println("Name: ");
        cruise2.setname(scanner.nextLine());
        System.out.println("Launch Date (mm/dd/yyyy): ");
        cruise2.setlaunchdate(scanner.nextLine());
        System.out.println("Passenger Capacity: ");
        cruise2.setpassengercap(scanner.nextInt());
        System.out.println("Crew Members: ");
        cruise2.setcrewmem(scanner.nextInt());
        scanner.nextLine(); 

        
        System.out.println("\nEnter details for Cargo Ship:");
        System.out.println("Name: ");
        cargo.setname(scanner.nextLine());
        System.out.println("Launch Date (mm/dd/yyyy): ");
        cargo.setlaunchdate(scanner.nextLine());
        System.out.println("Tonnage (DWT): ");
        cargo.settonnage(scanner.nextDouble());
        System.out.println("Maximum Speed (knots): ");
        cargo.setmaxspeed(scanner.nextDouble());
        scanner.nextLine(); 

        // Output the details
        System.out.println("\nShip Details:");
        System.out.println(cruise1.toString());
        System.out.println(cruise2.toString());
        System.out.println(cargo.toString());

        scanner.close();

	}

}
