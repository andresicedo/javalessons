package lesson07_NestedStatements;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Nesting - putting a statement inside of another statement
		System.out.print("Input your age: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if(age >= 18) {
			System.out.println("Where are you from? ");
			String from = sc.nextLine();
			if (from.equals("texas") || from.equals("Texas")) {
				System.out.println("Hell yeah, me too!");
			}
		} 
		else if (age >= 13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are a child");
		}
		

	}

}
