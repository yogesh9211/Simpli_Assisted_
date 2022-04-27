class Outerclass2 {
	private String g = "Simplilearn";
	void display() {
	
	class Innerclass2 {
		void msg() {
			System.out.println(g);
			
		}
	}
	Innerclass2 inner = new Innerclass2();
	inner.msg();
	}
}
public class LocalInnerClassDemo {
public static void main(String[] args) {
		System.out.println("Localinnerclass operaytion done");
		Outerclass2 outer = new Outerclass2();
		outer.display();
		
	}
}

