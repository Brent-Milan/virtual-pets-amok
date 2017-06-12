
public class RobotCat extends Cat implements Robotic{

	protected int maintenance;
	protected int energy;
	
	public RobotCat(String name, String type) {
		super(name, type);
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
	
	protected boolean isHappy() {
		if(maintenance >= 1 && energy >= 1) {
			return true;
		} return false;
	}
}
