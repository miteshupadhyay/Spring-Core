package spring.binu;

public class Dog implements Animal{

	String food;
	
	
	
	@Override
	public String animalType() {
		return "This is the Dog , who eats "+food;
	}

	public Dog() {
		System.out.println("This is Default Constructor");
	}

	
	
	public Dog(String food) { this.food = food; }
	 


	
	
	
	
	
}
