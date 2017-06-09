
public class RobotDog extends VirtualPet implements Robotic {

	protected int maintenance;
	protected int energy;
	
	public RobotDog() {
		maintenance = 10;
		energy = 10;
	}
	
	@Override
	public void maintain() {
		 maintenance += 10;
	}
	
	@Override
	public void charge() {
		energy += 10;
	}
	
	@Override
	public void play() {
		energy -= 2;
	}
	
}
