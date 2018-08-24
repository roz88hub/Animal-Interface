
public class Ox  extends Animal implements Pullers{
	
	public Ox(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	private int capacity;
	
	//creating getters and setters
	public int getCapacity() {
		return capacity;
	}  

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	 public void carry() {
		 
	 }

	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	

}
