
public class RobotDog extends Dog implements Robotic {

	protected int maintenance; // 1 - 10 Keep High
	protected int energy;  // 1 - 10 Keep High
	
	public RobotDog(String name, String type) {
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
		return happiness >= 1 && energy >= 1 && maintenance >= 1;
	}
	
	@Override
	public void walk(){
		happiness += 5;	
		energy -= 1;
	}
	
	
	
}
