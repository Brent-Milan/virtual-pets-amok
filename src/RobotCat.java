
public class RobotCat extends VirtualPet implements Robotic{

	protected int maintenance;
	protected int energy;
	
	public RobotCat() {
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
