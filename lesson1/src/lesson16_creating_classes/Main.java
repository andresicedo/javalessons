package lesson16_creating_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog andres = new Dog("andres", 4);
		andres.speak();//I am andres and I am 4 years old
		
		Dog clifford = new Dog("Clifford", 2);
		clifford.speak();//I am Clifford and I am 2 years old

		Dog dre = new Dog("dre", 21);
		dre.speak();//I am dre and I am 21 years old
		
		int x = andres.getAge();
		System.out.println(x);//4
		
		andres.setAge(21);
		andres.speak();//I am andres and I am 21 years old

	}

}
