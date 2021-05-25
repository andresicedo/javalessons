package lesson20_inner_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		in.display();
		
		System.out.println();
	}

}
