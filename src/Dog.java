
public class Dog extends VirtualPet {

	public Dog(){
		
	}
	
	protected String speak(){
		return "Woof";
	}
	
	protected void walk(){
		happiness += 5;
	}
	
	
}
