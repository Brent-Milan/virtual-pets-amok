
public class Cat extends VirtualPet {

	public Cat(String name, String type) {
		super(name, type);
	}

	@Override
	protected String speak(){
		return "Meow";
	}
}
	

