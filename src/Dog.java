
public class Dog extends VirtualPet {

	public Dog(String name, String type) {
		
	}
	
	protected String speak(){
		return "Woof";
	}
	
	protected void walk(){
		happiness += 5;
	}
	
	
}
