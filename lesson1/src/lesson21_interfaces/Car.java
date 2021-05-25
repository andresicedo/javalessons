package lesson21_interfaces;

public class Car implements Vehicle {
	private int gear = 1;
	private int speed = 0;
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	public void speedUp(int change) {
		this.speed += change;
	}
	
	public void slowDown(int change) {
		this.speed -= change;
	}
	
	public void display() {
		System.out.println("I am going " + this.speed + " km/hr, in gear " + this.gear);
		out();
	}
}
