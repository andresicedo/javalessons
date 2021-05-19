package lesson10_for_loops_cont;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9,21};
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		
		//for each loop
		int i = 0;
		for(int element:arr) {
			System.out.println(element + " " + i);
			i++;
		}
		
		
		for (int j = 0; j < names.length; j++) {
			System.out.println("Input: ");
			String input = sc.nextLine();
			names[j] = input;
		}
		
		for(String name:names) {
			System.out.println(name);
		}
	}

}
