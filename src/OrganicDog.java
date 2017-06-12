
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
		
	}
	
	@Override
	public void water() {
		thirst -= 10;
	}
	
	@Override
	public void play(){
		happiness += 5;
	}
	
	@Override
	protected void walk() {
		happiness += 5;
		wasteLevel -= 4;  //reduces waste by double the level of tick()
	}
	
	
	public void cleanCage() {
		wasteLevel = 0;
	}
	
	public boolean isHappy() {
		if(hunger <= 19 && thirst <= 19) {
			return true;
		} return false;
	}
}
