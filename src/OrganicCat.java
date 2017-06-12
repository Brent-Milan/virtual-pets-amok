
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
	public void play()	{
		happiness += 5;
	}
	
	
	
}
