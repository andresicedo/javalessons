package lesson20_inner_classes;

public class OuterClass {
	public class InnerClass {
		public void display() {
			System.out.println("This is the inner class");
		}
	}
	
	
	public void inner() {
		InnerClass in = new InnerClass();
		in.display();
	}
}
