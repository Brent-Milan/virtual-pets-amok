
public abstract class Dog extends VirtualPet implements Organic {

	
	public int hunger;
	public int thirst;
	public int happiness;
	
	//constructor
	public Dog(int hunger){
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
