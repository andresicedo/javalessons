package lesson11_while_loops;
import java.util.Scanner;

public class Sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		
		
		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
		} while (x != 10);
	}

}
