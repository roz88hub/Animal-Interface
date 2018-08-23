
public class Dog  extends Animal implements Pets, Pullers {

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	private String breed; 

	//Generating Getters and Setters
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void carry() {
		// TODO Auto-generated method stub
		
	}

	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

}
