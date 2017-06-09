
public class OrganicCat extends Cat implements Organic{
	
	public int hunger;
	public int thirst;
	public int happiness;
	
	//constructor
	public OrganicCat(int hunger){
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
	
}
