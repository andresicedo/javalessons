package lesson17_inheritance;

public class Cat extends Dog {
	
	protected int food;

	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	
	public Cat(String name) {
		super(name, 0);
		this.food = 50;
	}

	public static void main(String[] args) {
		

	}
	
	public void speak() {
		System.out.println("Meow, my name is " + this.name + ". I am " + this.age + 
				" years old and I eat " + this.food + " pounds of "
						+ "food everyday.");
	}
	
	public void ear(int x) {
		this.food -= x;
	}

}
