
public class OrganicCat extends Cat implements Organic{
	
	protected int hunger; // 1- 10 Keep Low
	protected int thirst; // 1-10  Keep Low
	//wasteLevel not applicable. 
	//See: VirtualPetShelter -> litterBox
	
	//constructor
	public OrganicCat(String name, String type){
		super(name, type);
		hunger = 5;
		thirst = 5;
		happiness = 10;
		
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
	
	public boolean isHappy() {
		return happiness >= 1;
	}
	
	
}
