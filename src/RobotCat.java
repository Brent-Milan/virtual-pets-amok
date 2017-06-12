
public class RobotCat extends Cat implements Robotic{

	protected int maintenance;
	protected int energy;
	
	public RobotCat(String name, String type) {
		super(name, type);
		maintenance = 10;
		energy = 10;
		happiness = 10;
	}
	
	@Override
	public void maintain() {
		maintenance = 10;
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
	}
	
	@Override
	public void charge() {
		energy = 10;
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
	}

	@Override
	public void play() {
		energy -= 2;
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
	}
	
	protected boolean isHappy() {
		return happiness >= 1;
	}
}
