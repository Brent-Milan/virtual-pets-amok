import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		RobotDog rDog = new RobotDog("Foxy", "Robot Dog");
		RobotCat rCat = new RobotCat("Momo", "Robot Cat");
		OrganicDog oDog = new OrganicDog("Sly", "Organic Dog");
		OrganicCat oCat = new OrganicCat("Drumpf", "Organic Cat");
		
		shelter.addPet(rDog);
		shelter.addPet(rCat);
		shelter.addPet(oDog);
		shelter.addPet(oCat);
		
		System.out.println("Here are some pets to get you started:\n");
		shelter.addPetAnnounce();
	
		System.out.println("\n\nWelcome To The Team!! Remember our motto: ");
		System.out.println("\n\"Market-friendly name; but corporate culture\".");
	
	do {
		System.out.println("\n----------------------------------------------------");
		System.out.println("\nWelcome to the *Altruistic Hipster* Pet Shelter:\n");
		System.out.println("Thank you for interning. We're happy to not pay you!\n");
		
		System.out.println("This is the current status of your pets: \n");
		
		shelter.displayRoboticStatus();
		
		shelter.displayOrganicStatus();
			
		System.out.println("\nWhat would you like to do?");
		System.out.println("\n1. Feed all organic pets.");
		System.out.println("2. Water all organic pets.");
		System.out.println("3. Charge all robotic pets");
		System.out.println("4. Perform maintenance on all robotic pets");
		System.out.println("5. Play with a pet");
		System.out.println("6. Clean the shelter litter box");
		System.out.println("7. Clean the cages of all organic dogs.");
			if(!shelter.isLitterBoxClean()) {
				System.out.println("\nWARNING: The shelter litter box is overflowing. Please clean it ASAP.");
			} else if (!shelter.isCageClean()) {
				System.out.println("\n WARNING: The dog cages are a filthy mess. Please clean them ASAP.");
			}
		int userInput = input.nextInt();
		
		
		switch(userInput) {
			case 1: 
				System.out.println("All organic animals have been fed!");
				shelter.feedAll();
				shelter.tickAll(shelter);
				break;
			case 2:
				System.out.println("All organic animals have been fed!");
				shelter.waterAll();
				shelter.tickAll(shelter);
				break;
			case 3:	
				System.out.println("All robotic animals have been charged!");
				shelter.chargeAll();
				shelter.tickAll(shelter);
				break;
			case 4: 
				System.out.println("Oil applied, drivers updated, and general maintenance performed on your robotic pets.");
				shelter.maintainAll();
				break;
			case 5:
				shelter.displayPets();
				System.out.println("\nType the name of the pet you wish to play with:");
				String userChoice = input.next();
					if(!shelter.petCheck(userChoice)) {
						System.out.println("\nYour input is invalid.\nEnter the name of the pet you wish to play with: ");
						userChoice = input.next();
					} else {
						System.out.println("\nPet located. You played with " + userChoice);
					}
				shelter.tickAll(shelter);
				break;
			case 6: 
				System.out.println("The litter box has been cleaned. This should keep the cats (and everyone else) healthy");
				shelter.cleanLitterBox();
				shelter.tickAll(shelter);
				break;
			case 7:
				System.out.println("All dog cages have been cleaned. This should keep the dogs (and everyone else) healthy");
				shelter.cleanCages();
				shelter.tickAll(shelter);
				break;
			default:
				System.out.println("This isn't rocket science. Back to the top");
		}
	}
		while (shelter.areRoboticsAlive() && shelter.areOrganicsAlive() && shelter.isCageCritical() && shelter.isLitterBoxCritical());

	System.out.println("Game over, man. Pet happiness is suffering. Keep things charged, fed, and clean!");
	}
}
