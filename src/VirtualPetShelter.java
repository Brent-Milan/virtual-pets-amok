import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {


	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	protected int litterBox = 0;
	
	protected void addPet(VirtualPet addMe) {
		shelterPets.put(addMe.name, addMe);
		// System.out.println(addPetAnnounce(addMe));
	}

	protected void addPetAnnounce() {
		for (VirtualPet x : shelterPets.values()) {
			System.out.println(x.name + " has been added to the shelter!");
		}
	}

	protected void displayPets() {
		for (Entry<String, VirtualPet> current : shelterPets.entrySet()) {
			VirtualPet pet = current.getValue();
			System.out.println("Type: " + pet.type + "  Name: " + pet.name);
		}
	} 
	
	protected void displayOrganicStatus() {
		System.out.println("  Name\t  | Hunger | Thirst |		[Don't let stats get too high (1-20)]");
		System.out.println("-----------------------------");
		for(VirtualPet current: pets()) {
			if(current instanceof OrganicDog) {
				System.out.println(current.name + "\t\t" + ((OrganicDog)current).hunger + "\t" + ((OrganicDog)current).thirst);
			}
			if(current instanceof OrganicCat) {
				System.out.println(current.name + "\t\t" + ((OrganicCat)current).hunger + "\t" + ((OrganicCat)current).thirst);
			}
		}
	}
	
	protected void displayRoboticStatus() {
		System.out.println("\n  Name\t  | Maintenance| Energy |	    [Don't let stats get too low (1-10)]");
		System.out.println("------------------------------------");
		for(VirtualPet current: pets()) {
			if(current instanceof RobotDog) {
				System.out.println(current.name + "\t\t" + ((RobotDog)current).maintenance + "\t" + ((RobotDog)current).energy);
			}
			if(current instanceof RobotCat) {
				System.out.println(current.name + "\t\t" + ((RobotCat)current).maintenance + "\t" + ((RobotCat)current).energy);
			}
		}
	}
	
	
	/****************************************************
	 * Methods for checking number of occurrences of an interface OR checking
	 * map size
	 ***************************************************/
	protected Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	protected int robotCount() {
		int count = 0;
		for (VirtualPet current : pets()) {
			if (current instanceof Robotic) {
				count++;
			}
		}
		return count;
	}

	protected int getSize() {
		return shelterPets.size();
	}

	/*********************************
	 * Interactions with All pets
	 *********************************/
	protected void feedAll() {
		for (VirtualPet current : shelterPets.values()) {
			if (current instanceof Organic) {
				((Organic) current).feed();
			}
		}
	}

	protected void waterAll() {
		for (VirtualPet current : shelterPets.values()) {
			if (current instanceof Organic) {
				((Organic) current).feed();
			}
		}
	}

	protected void chargeAll() {
		for (VirtualPet current : pets()) {
			if (current instanceof Robotic) {
				((Robotic) current).charge();
			}
		}
	}

	protected void maintainAll() {
		for (VirtualPet current : pets()) {
			if (current instanceof Robotic) {
				((Robotic) current).maintain();
			}
		}
	}
	
	protected void cleanCages() {
		for (VirtualPet current : pets()) {
			if (current instanceof OrganicDog) {
				((OrganicDog) current).cleanCage();
			}
		}
	}

	/***************
	 * Boolean Tests
	 ****************/

	protected boolean isCageClean() {
		for(VirtualPet current: pets()) {
			if(current instanceof OrganicDog) {
				return ((OrganicDog) current).wasteLevel <= 15;
			}	
		} return false;
	}
	
	protected boolean isLitterBoxClean() {
		return litterBox <=15;
	}
	
	protected boolean isCageCritical() {
		for(VirtualPet current: pets()) {
			if(current instanceof OrganicDog) {
				return ((OrganicDog) current).wasteLevel >= 20;
			}	
		} return false;
	}
	
	protected boolean isLitterBoxCritical() {
		return litterBox >= 20;
	}
	
//	protected boolean areOrganicsAlive() {
//		for(VirtualPet current: pets()) {
//			if(current instanceof Organic) {
//				return ((Organic) current).isHappy();
//			}	
//		} return false;
//	}
	
	protected boolean petsAreHappy() {
		for(VirtualPet current: pets()) {
			 int check = current.getHappiness();
			 return check >= 1;
		} return false;
	}
		
	
	protected boolean petCheck(String message) {
		for (VirtualPet current : pets()) {
			if (message.equalsIgnoreCase(current.name)) {
				return true;
			} 
		} return false;
	}
	
	
	
	
	public void cleanLitterBox() {
		litterBox = 0;
	}
	
	
	public void litterTick() {
		litterBox += 1;
	}
	
	protected void tickAll(VirtualPetShelter s) {
	for(VirtualPet current: pets()) {
		if(current instanceof RobotDog) {
			((RobotDog)current).maintenance -= 1;
			((RobotDog)current).energy -= 1;
		}
		if(current instanceof RobotCat) {
			((RobotCat)current).maintenance -= 1;
			((RobotCat)current).energy -= 1;
		}
		if(current instanceof OrganicDog) {
			((OrganicDog)current).hunger += 1;
			((OrganicDog)current).thirst += 1;
			((OrganicDog)current).wasteLevel += 1;
		}
		if(current instanceof OrganicCat) {
			((OrganicCat)current).hunger +=1;
			((OrganicCat)current).thirst += 1;
		}
	}
	litterBox++;
}
	
	
	
//	protected void feedPet(String message) {
//		for (VirtualPet current : pets()) {
//			if (message.equalsIgnoreCase(current.name)) {
//				current.feed();
//			} 
	
	



}
