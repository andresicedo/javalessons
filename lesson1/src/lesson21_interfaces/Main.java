package lesson21_interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford = new Car();
		ford.speedUp(10);
		ford.changeGear(2);
		ford.display();
		
		
		int x = Vehicle.math(12);
		System.out.println(x);
	}

}
