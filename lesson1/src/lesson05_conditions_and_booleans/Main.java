package lesson05_conditions_and_booleans;

public class Main {

	public static void main(String[] args) {
		int x = 6;
		int y = 7;
		int z = 10;
		String xx = "hello";
		String yy = "hola";
		// > < == >= <= !=
		// and/or/not
		// &&/||/!()
		boolean compare = xx != yy && x < y;//true
		boolean compare2 = xx != yy || x == y;//true
		boolean compare3 = !(xx.equals(yy));//true
		
		System.out.println(compare3);

	}

}
