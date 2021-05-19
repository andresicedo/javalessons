package lesson09_for_loops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,9,12,15,18,21};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 21) {
				System.out.println("21 at index " + i);
			}
		}
		
	}

}
