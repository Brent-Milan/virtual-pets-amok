
public class RobotDog extends VirtualPet implements Robotic {

	protected int maintenance; // 1 - 10 Keep High
	protected int energy;  // 1 - 10 Keep High
	
	public RobotDog() {
		maintenance = 10;
		energy = 10;
	}
	
	@Override
	public void maintain() {
		 maintenance = 10;
	}
	
	@Override
	public void charge() {
		energy += 10;
	}
	
	@Override
	public void play() {
		energy -= 2;
	}
	
//	@Override
//	public void walk(){
//		happiness += 5;	
//	}
	
}