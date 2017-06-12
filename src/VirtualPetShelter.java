import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	protected int litterBox = 0;
	
	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();
	
	protected void addPet(VirtualPet addMe) {
		shelterPets.put(addMe.type, addMe);
	}
	
	/****************************************************
	 * Methods for checking number of occurrences of an interface
	 * OR checking map size
	 ***************************************************/
	protected Collection<VirtualPet> pets(){
		return shelterPets.values();
	}
	
	protected int robotCount() {
		int count = 0;
		for(VirtualPet current: pets()) {
			if(current instanceof Robotic) {
				count++;
			}
		} return count;
	}
	
	protected int getSize() {
		return shelterPets.size();
	}
	
	
	protected void feedAll() {
		for(VirtualPet current : shelterPets.values()) {
			if(current instanceof Organic) {
			((Organic) current).feed();
			}
		}
	}
	
	protected void waterAll() {
		for(VirtualPet current : shelterPets.values()) {
			if(current instanceof Organic) {
			((Organic) current).feed();
			}
		}
	}
	
	protected void chargeAll() {
		for(VirtualPet current : pets()) {
			if(current instanceof Robotic) {
			((Robotic) current).charge();
			}
		}
	}
	
	protected void maintainAll() {
		for(VirtualPet current: pets()) {
			if(current instanceof Robotic) {
			((Robotic) current).maintain();
			}
		}
	}
	
	protected void displayPets() {
		for(Entry<String, VirtualPet> current: shelterPets.entrySet()) {
			String petType = current.getKey();
			VirtualPet pet = current.getValue();
			System.out.println("ID: " + petType + "  Name: " + pet.name); 
	}
}
	
	public void cleanLitterBox() {
		litterBox = 0;
	}
	
	
	
}
