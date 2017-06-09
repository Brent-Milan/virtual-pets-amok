
public class OrganicDog extends Dog implements Organic{


	public int hunger; // 1- 20 Keep Low
	public int thirst;  //1-20  Keep Low
	public int wasteLevel;   // 1-20   Keep Low
	
	//constructor
	public OrganicDog(int hunger){
		this.hunger = hunger;
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
	
	public void cleanCage() {
		wasteLevel = 0;
	}
}
