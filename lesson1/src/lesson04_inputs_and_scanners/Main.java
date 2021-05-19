package lesson04_inputs_and_scanners;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Inputs and scanners
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();//string input
		
		int a = Integer.parseInt(scanned);
		

		System.out.print(a);
	}

}
