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
	
//	do {
		System.out.println("\n----------------------------------------------------");
		System.out.println("\nWelcome to the *Altruistic Hipster* Pet Shelter:\n");
		System.out.println("Thank you for interning. We're happy to not pay you!\n");
		
		System.out.println("This is the current status of your pets: \n");
		
//		shelter.displayMenu();
			
		System.out.println("\nWhat would you like to do?");
		System.out.println("\n1. Feed all organic pets.");
		System.out.println("2. Water all organic pets.");
		System.out.println("3. Charge all robotic pets");
		System.out.println("4. Perform maintenance on all robotic pets");
		System.out.println("5. Play with a pet");
		System.out.println("6. Clean the shelter litter box");
		System.out.println("7. Clean the cages of all organic dogs.");
//			if(!shelter.allClean()) {
//				System.out.println("\nSome of the animals are quite dirty. Time to clean the cages.");
//			}
		int userInput = input.nextInt();
		
		
		switch(userInput) {
			case 1: 
				if(shelter.getSize() == 1) {
					System.out.println("Your shelter pet has been fed!");
				} else {
					System.out.println("All " + shelter.getSize() + " organic animals have been fed!");
				}
				shelter.feedAll();
				break;
			case 2:
				if(shelter.getSize() == 1) {
					System.out.println("Your organic shelter pet has been watered!");
				} else {
					System.out.println("All " + shelter.getSize() + " organic animals have been fed!");
				}
				shelter.waterAll();
				break;
			case 3:	
				if(shelter.getSize() == 1) {
					System.out.println("Your robotic shelter pet has been charged!");
				} else {
					System.out.println("All " + shelter.getSize() + " robotic animals have been charge!");
				}
				shelter.chargeAll();
				break;
			case 4: 
				System.out.println("Oil applied, drivers updated, and general maintenance performed on your robotic pets.");
				shelter.maintainAll();
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
			case 6: 
				System.out.println("The litter box has been cleaned. This should keep the cats (and everyone else) healthy");
				shelter.cleanLitterBox();
			case 7:
				System.out.println("All dog cages have been cleaned. This should keep the dogs (and everyone else) healthy");
				shelter.cleanCages();
			default:
								
	
	
	

	
			} // end switch
	}
}
