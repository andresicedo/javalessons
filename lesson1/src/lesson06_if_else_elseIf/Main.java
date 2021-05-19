package lesson06_if_else_elseIf;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("andres")) {
			System.out.println("Hey, that's me!");
		} 
		else if (s.equals("Andres")){
			System.out.println("Hey, that's me!");
		}
		else {
			System.out.println("No, try again");
		}
	}

}
