
public abstract class VirtualPet {

	protected String name;
	protected String type;
	protected String happiness;
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
	
	
//	protected void tick(Dog x){
//		happiness -= 2;
//		if( x = x.instanceOf(RobotDog)) {
//			maintenance -= 1;
//		}
//	}
}
