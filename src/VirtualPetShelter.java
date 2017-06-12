import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	protected int litterBox = 0;

	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	protected void addPet(VirtualPet addMe) {
		shelterPets.put(addMe.type, addMe);
		// System.out.println(addPetAnnounce(addMe));
	}

	protected void addPetAnnounce() {
		for (VirtualPet x : shelterPets.values()) {
			System.out.println(x.name + " has been added to the shelter!");
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

	protected void displayPets() {
		for (Entry<String, VirtualPet> current : shelterPets.entrySet()) {
			VirtualPet pet = current.getValue();
			String petType = current.getKey();
			System.out.println("Type: " + petType + "  Name: " + pet.name);
		}
	}

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
	
	protected boolean areOrganicsAlive() {
		for(VirtualPet current: pets()) {
			if(current instanceof Organic) {
				return ((Organic) current).isHappy();
			}	
		} return false;
	}
	
	protected boolean areRoboticsAlive() {
		for(VirtualPet current: pets()) {
			if(current instanceof Robotic) {
				return ((Robotic) current).isHappy();
			}	
		} return false;
	}
		
	
		
	
	
	protected boolean petCheck(String message) {
		for (VirtualPet current : pets()) {
			if (message.equalsIgnoreCase(current.name)) {
				return true;
			} 
		} return false;
	}
	
	
	
	
	
	
//	protected void feedPet(String message) {
//		for (VirtualPet current : pets()) {
//			if (message.equalsIgnoreCase(current.name)) {
//				current.feed();
//			} 
	
	


	public void cleanLitterBox() {
		litterBox = 0;
	}

}
