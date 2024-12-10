import java.util.Scanner; 
public class lazyWizard {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("You are a wizard named gary, and you are very, very lazy. \nyou awake on your sofa and use a spell to open the fridge. \nupon opening the fridge, you come to the realization that there is no soda left! \nyou exclaim, \nHow am i supposed to enjoy a lazy day without soda?!?! \nyou then remember that the store closes at 10 PM, you check your watch and the time is 9:43 pm. \ndo you: \n1.drive to the store to buy more soda \n2.have doordash bring you soda \n3.make your own soda");
		
		double response = key.nextDouble();
		
		if(response == 1)
		{
			System.out.println("You get in to your car and drive to the store just in time. \nyou seem to be having an issue deciding which soda you want the most. \nyou narrow down your options to three sodas. \ndo you: \n1.buy Magical Mango \n2.buy Poisoned Peach \n3.buy Fairy-Tale Fruit Punch");
			
			double response1 = key.nextDouble();
			
			if(response1 == 1)
			{
				System.out.println("you pick up a 2 liter bottle of Magical Mango, check out, and drive home. \nyou take a sip of the drink and the sugary flavor slams your tastebuds. \nyou think to yourself, \nno soda is complete without food! \ndo you: \n1.check the kitchen for any food \n2.go out and buy some food \n3.doordash fast food to your house");
				
				double response4 = key.nextDouble();
				
				if(response4 == 1)
				{
					System.out.println("you go to the kitchen to find something to snack on. \nyou open the cabinet and theres nothing there. \nyou go back to the couch, lay your head down, and fall asleep. \nThe End");
				}
				else if(response4 == 2)
				{
					System.out.println("you hop in your car and drive to a pizza place, only to discover that it is closed. \nyou drive home, sit back down on the couch, turn on the tv, and fall asleep before the soda could even reach your lips. \nThe End");
				}
				else if(response4 == 3)
				{
					System.out.println("you doordash a bag of chips to your house. \nthe driver arrives, delivers your chips, and you sit back down on the couch. \nbefore you can eat a single chip, you fall asleep on the couch. \nThe End");
				}
			}
			else if(response1 == 2)
			{
				System.out.println("you pick up a 2 liter bottle of Poisoned Peach, check out, and drive home. \nyou take a sip of the drink and you are suddenly overwhelmed with a sharp pain in your stomach. \nto no ones surprise, the Poisoned Peach flavored soda was actually poisoned. \nthankfully, the poison is not fatal, but it feels as if your stomach is begging for help. \ndo you: \n1.wait it out and endure the painful stomachache \n2.go to the doctor \n3.puke it all out");
				
				double response5 = key.nextDouble();
				
				if(response5 == 1)
				{
					System.out.println("you sit on the couch, clenching your stomach in pain. it seems as if the pain wont end. \nyou lay down on your side and end up falling asleep. \nThe End");
				}
				else if(response5 == 2)
				{
					System.out.println("you hop in your car and drive to the doctors office \nthe doctor examines you and tells you, \n you drank poison, i dont know what you expected. its best if you just let the pain pass, which wont be for a while. \nyou go home and lay on your couch and get ready to endure the pain. \nyou end up falling asleep on the couch. \nThe End");
				}
				else if(response5 == 3)
				{
					System.out.println("you stumble your way to the toilet. you lean over the toilet and begin to gag. \nafter you get everything out of your system, you throw yourself onto the couch and fall asleep. \nThe End");
				}
			}
			else if(response1 == 3)
			{
				System.out.println("you pick up a 2 liter bottle of Fairy-Tale Fruit Punch, check out, and drive home. \nyou take a sip of the drink and the sugary flavor slams your tastebuds. \nyou think to yourself, \nno soda is complete without food! \ndo you: \n1.check the kitchen for any food \n2.go out and buy some food \n3.doordash fast food to your house");
				
				double response6 = key.nextDouble();
				
				if(response6 == 1)
				{
					System.out.println("you go to the kitchen to find something to snack on. \nyou open the cabinet and theres nothing there. \nyou go back to the couch, lay your head down, and fall asleep. \nThe End");
				}
				else if(response6 == 2)
				{
					System.out.println("you hop in your car and drive to a pizza place, only to discover that it is closed. \nyou drive home, sit back down on the couch, turn on the tv, and fall asleep before the soda could even reach your lips. \nThe End");
				}
				else if(response6 == 3)
				{
					System.out.println("you doordash a bag of chips to your house. \nthe driver arrives, delivers your chips, and you sit back down on the couch. \nbefore you can eat a single chip, you fall asleep on the couch. \nThe End");
				}
			}
		}
		else if(response == 2)
		{
			System.out.println("You open up DoorDash and select the store. \nyou select your soda of choice, but the app is recommending you to spend more money for \nsome extra snacks to go with the order. \ndo you: \n1.add the extra snacks to the order \n2.dont buy the extra snacks \n3.cancel the order for the store and buy pizza instead");
			
			double response2 = key.nextDouble();
			
			if(response2 == 1)
			{
				System.out.println("You add the extra snacks onto your order, driving your total up 10 bucks. \nthis new total will have a heavy impact on your bank account, as your job doesnt pay much. \ndo you: \n1.buy the snacks anyways \n2.dont buy the snacks \n3.find a coupon online");
				
				double response7 = key.nextDouble();
				
				if(response7 == 1)
				{
					System.out.println("you buy the snacks despite not being very wealthy. \nthe snacks arrive and you sit down on your couch. \nyou fall asleep before you can even open the snack. \nThe End");
				}
				else if(response7 == 2)
				{
					System.out.println("you decide that it is better to not buy the snacks. \nyou lay back down on the couch and fall asleep \nThe End");
				}
				else if(response7 == 3)
				{
					System.out.println("you hop on your computer and search the internet for any coupon codes. \nyou find one that gets 20% off your order. \nyou place the order, knowing that you were somewhat productive today. \nafter you get the order, you lay back down in bed and fall asleep. \nThe End");
				}
			}
			else if(response2 == 2)
			{
				System.out.println("You ignore the recommendation and order your soda. \nthe driver arrives and is asking for tip. \ndo you: \n1.give him 20% tip \n2.give him 10% tip \n3.dont tip");
				
				double response8 = key.nextDouble();
				
				if(response8 == 1)
				{
					System.out.println("you give the delivery driver 20% tip and take your order. \n you sit down on your couch, and before you can drink the soda, you fall back asleep. \nThe End");
				}
				else if(response8 == 2)
				{
					System.out.println("you give the delivery driver 10% tip and take your order. \n you sit down on your couch, and before you can drink the soda, you fall back asleep. \nThe End");
				}
				else if(response8 == 3)
				{
					System.out.println("you close the door on the delivery driver, not tipping him. \n your feel bad for your actions. \nyou sit down on your couch, and before you can drink your soda, you fall asleep. \nThe End");
				}
			}
			else if(response2 == 3)
			{
				System.out.println("Rather than ordering only a drink, you decide to order a whole pizza for yourself. \nthe pizza arrives and the driver is asking for tip. \ndo you: \n1.give him 20% tip \n2.give him 10% tip \n3.dont tip");
				
				double response9 = key.nextDouble();
				
				if(response9 == 1)
				{
					System.out.println("you give the delivery driver 20% tip and take your order. \n you sit down on your couch, and before you can drink the soda, you fall back asleep. \nThe End");
				}
				else if(response9 == 2)
				{
					System.out.println("you give the delivery driver 10% tip and take your order. \n you sit down on your couch, and before you can drink the soda, you fall back asleep. \nThe End");
				}
				else if(response9 == 3)
				{
					System.out.println("you close the door on the delivery driver, not tipping him. \n your feel bad for your actions. \nyou sit down on your couch, and before you can drink your soda, you fall asleep. \nThe End");
				}
			}
		}
		else if(response == 3)
		{
			System.out.println("You get up from the couch, set up all of your potion making equipment, find your recipie, and begin cooking. \nyou realize that one of the ingredients is missing. \nyou have 3 liquids in front of you, you dont know what any of them do or taste like, but you know one of them is the right liquid. \ndo you: \n1.add the red liquid \n2.add the blue liquid \n3.add the green liquid");
			
			double response3 = key.nextDouble();
			
			if(response3 == 1)
			{
				System.out.println("you add the red liquid. \nthe drink fizzes way too much and your entire room is covered in sticky liquid. \nyou clean up a decent portion of the mess, then lay on your couch to rest. \nyou end up falling asleep on the couch. \nThe End");
			}
			else if(response3 == 2)
			{
				System.out.println("you add the blue liquid. \nthe drink has a very light reaction. you take one sip of the drink and fall in love with it. \nyou turn on the tv and watch your favorite show while sipping on your newly created carbonated concoction. \nThe End");
			}
			else if(response3 == 3)
			{
				System.out.println("you add the green liquid. \nthe drink starts heating up to unfathomable temperatures, causing your glass to shatter and spill onto the floor. \nyou realize you have just added calcium chloride to the mixture. \nyou clean up the mess and throw yourself on the couch. \nyou end up falling asleep on the couch \nThe End");
			}
		}
		
			

	}

}
