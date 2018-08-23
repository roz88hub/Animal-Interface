
public abstract class Animal {

	private String name;
	private int age;
	
	// Generating Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() { 
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// toString Methods
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	//Creating constructor
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract void sound();
	;
	public void hello() {
		System.out.println("Hello");
	}
	
}
