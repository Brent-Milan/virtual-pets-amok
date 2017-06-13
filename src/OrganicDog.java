
public class OrganicDog extends Dog implements Organic{


	public int hunger; // 1- 20 Keep Low
	public int thirst;  //1-20  Keep Low
	public int wasteLevel;   // 1-20   Keep Low
	
	//constructor
	public OrganicDog(String name, String type){
		super(name, type);
		hunger = 5;
		thirst = 5;
		happiness = 10;
		wasteLevel = 0;
	}
		
	
	@Override
	public void feed() {
		 hunger -= 10;
		 if(hunger < 0) {
			 hunger = 0;
		 }
	}
	
	@Override
	public void water() {
		thirst -= 10;
		if(thirst < 0) {
			 thirst = 0;
		 }
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
	}
	
	@Override
	public void play()	{
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
	}
	
	@Override
	protected void walk() {
		happiness += 5;
		if (happiness > 10) {
			happiness = 10;
		}
		wasteLevel -= 4; 
	}
	
	
	public void cleanCage() {
		wasteLevel = 0;
	}
	
	public boolean isHappy() {
		return happiness >= 1;
	}
	
	
}
