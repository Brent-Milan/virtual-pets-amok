
public abstract class VirtualPet {

	protected String name;
	protected String type;
	protected int happiness;
	// Note: AI pets also express happiness
	
	
	protected VirtualPet(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	public void play(){
		
	}
	
	protected String speak(){
		return "";
	}
	
	protected int getHappiness() {
		return happiness;
	}
	
}
	
