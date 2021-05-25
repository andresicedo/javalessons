package lesson19_overloading_methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dre = new Student("Dre");
		Student joe = new Student("Joe");
		Student tim = new Student("Tim");
		
		System.out.println(dre.equals(joe));//false
		System.out.println(dre.compareTo(joe) > 0);//false
		System.out.println(dre);
	}

}
