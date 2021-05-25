package lesson18_static_keyword;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dre = new Dog("dre", 9);
		Dog bill = new Dog("bill", 9);
		Dog.count = 7;
		System.out.println(Dog.count);
	}

}
