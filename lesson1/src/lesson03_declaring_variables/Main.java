package lesson03_declaring_variables;

public class Main {

	public static void main(String[] args) {
		// Declaring variables
		int x;
		x=6;
		System.out.println(x);//6
		
		int z;
		int a = 3;
		int b = 7;
		z = 21;
		
		boolean sum = (a * b) == z;
		System.out.println(sum);//true
		
		
		//type casting
		double u = b / (double)a;
		System.out.println(u);//2.3333333333333335
		
		
		// remainder (modulo)
		int y = 56 % 5;
		System.out.println(y);
		
	}

}
