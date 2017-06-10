import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<Integer, VirtualPet> shelterPets = new HashMap<Integer, VirtualPet>();
	
	protected void addPet(int x, VirtualPet y) {
		shelterPets.put(x, y);
	}
	
	protected int getSize() {
		return shelterPets.size();
	}
	
	protected Collection<VirtualPet> pets(){
		return shelterPets.values();
	}
	
	
}